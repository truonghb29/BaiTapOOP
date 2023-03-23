import java.util.ArrayList;

public class DanhSachHinh {
    ArrayList<Hinh> dsHinh;

    public DanhSachHinh(){
        this.dsHinh = new ArrayList<Hinh>();
    }

    public DanhSachHinh(ArrayList<Hinh> dsHinh) {
        this.dsHinh = dsHinh;
    }

    public void themHinh(Hinh hinh){
        dsHinh.add(hinh);
    }
    public void inDSHinh(){
        for (Hinh hinh:dsHinh) {
            System.out.printf(hinh+"\n");
        }
    }
}
