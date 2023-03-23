import java.util.ArrayList;

public class QuanLy {
    ArrayList<ChuyenXe> cxs;

    public QuanLy() {
        this.cxs = new ArrayList<ChuyenXe>();
    }

    public QuanLy(ArrayList<ChuyenXe> cxs) {
        this.cxs = cxs;
    }

    public void themCX(ChuyenXe chuyenXe){
        cxs.add(chuyenXe);
    }

    public void inDSCX(){
        for (ChuyenXe dscx :cxs) {
            System.out.printf((dscx)+"\n");
        }
    }
}
