package Bai1;

public class NhanVienPartTime extends NhanVien {
    public int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien part time";
    }

    @Override
    public void tinhLuong() {
        System.out.println("Luong nhan vien part time");
    }
}
