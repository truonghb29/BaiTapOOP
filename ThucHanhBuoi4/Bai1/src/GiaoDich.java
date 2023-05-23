import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private LocalDate ngayGD;
    private double donGia;
    private double dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double thanhTien(){
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGD='" + maGD + '\'' +
                ", ngayGD=" + ngayGD +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma giao dich: ");
        maGD = sc.nextLine();
        System.out.printf("Nhap ngay giao dich: ");
        int ngay = sc.nextInt();
        System.out.printf("Nhap thang giao dich: ");
        int thang = sc.nextInt();
        System.out.printf("Nhap nam giao dich: ");
        int nam = sc.nextInt();
        ngayGD = LocalDate.of(nam,thang,ngay);
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap dien tich: ");
        dienTich = sc.nextDouble();
    }
}
