import java.time.LocalDate;
import java.util.Scanner;

public class Bao extends TaiLieu{
    private LocalDate ngayPhatHanh;

    public Bao() {
    }

    public Bao(int maTaiLieu, String tenNXB, int soBanPhatHanh, LocalDate ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ngay phat hanh: ");
        int ngay = sc.nextInt();
        System.out.printf("Nhap thang phat hanh: ");
        int thang = sc.nextInt();
        System.out.printf("Nhap nam phat hanh: ");
        int nam = sc.nextInt();
        ngayPhatHanh = LocalDate.of(nam,thang,ngay);
    }
}
