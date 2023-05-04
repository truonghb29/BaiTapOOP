import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CDList {
    ArrayList<CD> cds;
    public CDList() {
        this.cds = new ArrayList<>();
    }
    public void them(CD cd) {
         cd = new CD();
         cd.nhap();
         boolean kt = false;
         for (CD cd1 : cds){
             if (cd1.getMaCD() == cd.getMaCD()){
                 kt = true;
                 break;
             }
         }
         if (kt){
             System.out.println("Ma CD da ton tai!");
         }else {
             cds.add(cd);
             System.out.println("them thanh cong");
         }

    }

    public int count(){
        return cds.size();
    }
    public double tongGia(){
        double tong = 0;
        for (CD cd : cds){
            tong += cd.getGiaThanh();
        }
        return tong;
    }
    public void sapXepCDTheoGia() {
        Collections.sort(this.cds, new Comparator<CD>() {
                    @Override
                    public int compare(CD o1, CD o2) {
                        int i = (int) (o1.getGiaThanh() - o2.getGiaThanh());
                        if (i < 0) {
                            return -1;
                        } else if (i == 0) {
                            return 0;
                        }
                        return 1;
                    }
                }
        );
    }
    public void sapXepCDTheoTua() {
        Collections.sort(this.cds, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                int i = o1.getTuaCD().compareTo(o2.getTuaCD());
                if (i < 0) {
                    return 1;
                } else if (i == 0) {
                    return 0;
                }
                return -1;
            }
        });
    }

    public void inDSCD(){
        for (CD cd : cds){
            System.out.println(cd.toString());
        }
    }
    public void menu(){
        System.out.printf("------MENU------\n" +
                "1.Them\n" +
                "2.So cd hien co\n" +
                "3.Tinh tong gia thanh\n" +
                "4.Sap xep theo gia\n" +
                "5.Sap xep theo tua\n" +
                "6.In DSCD\n" +
                "0.Thoat khoi chuong trinh\n");
    }
}
