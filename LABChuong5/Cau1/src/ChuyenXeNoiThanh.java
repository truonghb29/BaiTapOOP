public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, int soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void doanhThu() {
        super.doanhThu();
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKmDiDuoc=" + soKmDiDuoc +
                '}';
    }

}
