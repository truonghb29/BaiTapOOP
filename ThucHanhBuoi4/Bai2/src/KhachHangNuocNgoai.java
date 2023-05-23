import java.time.LocalDate;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;
    private int soLuong;
    private double donGia;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngayRaHoaDon, String quocTich, int soLuong, double donGia) {
        super(maKH, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQuoc tich: " + quocTich +
                "\nSo luong: " + soLuong +
                "\nDon gia: " + donGia;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap quoc tich: ");
        quocTich = sc.nextLine();
        System.out.printf("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
}
