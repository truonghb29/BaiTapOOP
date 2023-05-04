import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(int maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.printf("Nhap ten tac gia: ");
        sc.nextLine();
        tenTacGia = sc.nextLine();
        System.out.printf("Nhap so trang: ");
        soTrang = sc.nextInt();
    }
}
