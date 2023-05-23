import java.time.LocalDate;
import java.util.Scanner;

public class KhachHangVN extends KhachHang {
    private String loaiKhachHang;
    private double  donGia, dinhMuc;
    private int soLuong;

    public KhachHangVN() {
    }

    public KhachHangVN(String maKH, String hoTen, LocalDate ngayRaHoaDon, String loaiKhachHang, int soLuong, double donGia, double dinhMuc) {
        super(maKH, hoTen, ngayRaHoaDon);
        this.loaiKhachHang = loaiKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
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

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double thanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            double soLuongVuot = soLuong - dinhMuc;
            return soLuong * donGia * dinhMuc + soLuongVuot * donGia * 2.5;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLoai khach hang: " + loaiKhachHang +
                "\nSo luong: " + soLuong +
                "\nDon gia : " + donGia +
                "\nDinh muc: " + dinhMuc;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap loai khach hang: ");
        loaiKhachHang = sc.nextLine();
        System.out.printf("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap dinh muc: ");
        dinhMuc = sc.nextDouble();
    }
}
