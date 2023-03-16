package Bai1;

public class NhanVienFullTime extends NhanVien {
    public int loaiChucVu;
    public int ngayLamThem;

    public NhanVienFullTime(String ten, int loaiChucVu, int ngayLamThem) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien fulltime";
    }

    @Override
    public void tinhLuong() {
        System.out.println("Luong nhan vien fulltime");
    }
}
