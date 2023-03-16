package Bai2;

public class HocSinhChuyenToan extends HocSinh {
    @Override
    public float DiemTrungBinh() {
        return (2 * diemtoan + diemLy + diemHoa) / 4;
    }
}