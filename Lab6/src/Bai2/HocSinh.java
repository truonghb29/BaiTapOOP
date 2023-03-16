package Bai2;

public class HocSinh {
    public String hoTen;
    public String lop;
    public float diemtoan;
    public float diemLy;
    public float diemHoa;

    float DiemTrungBinh() {
        return (diemtoan + diemLy + diemHoa) / 3;
    }

}
