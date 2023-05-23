import java.time.LocalDate;

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
}
