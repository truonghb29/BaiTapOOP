public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void doanhThu() {
        super.doanhThu();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }
}
