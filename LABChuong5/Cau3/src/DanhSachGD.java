import java.util.ArrayList;

public class DanhSachGD {
    ArrayList<GiaoDich> giaoDiches;

    public DanhSachGD(){
        this.giaoDiches = new ArrayList<GiaoDich>();
    }

    public DanhSachGD(ArrayList<GiaoDich> dsHinh) {
        this.giaoDiches = dsHinh;
    }

    public void themGD(GiaoDich giaoDich){
        giaoDiches.add(giaoDich);
    }
    public void inDSHinh(){
        for (GiaoDich hinh:giaoDiches) {
            System.out.printf(giaoDiches+"\n");
        }
    }
}
