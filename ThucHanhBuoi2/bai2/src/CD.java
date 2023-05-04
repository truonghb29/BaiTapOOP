import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CD {
    ArrayList<CD> cds;
    private long maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
        this.cds = new ArrayList<>();
    }

    public CD(long maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public long getMaCD() {
        return maCD;
    }

    public void setMaCD(long maCD) {
        if (maCD > 0) {
            this.maCD = maCD;
        } else {
            this.maCD = 999999;
        }

    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if (tuaCD != "") {
            this.tuaCD = tuaCD;
        } else {
            this.tuaCD = "Chua xac dinh";
        }

    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", soBaiHat=" + soBaiHat +
                ", giaThanh=" + giaThanh +
                '}';
    }

    public void nhap() {

    }

    public void them() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma CD: ");
        maCD = sc.nextLong();
        setMaCD(maCD);
        System.out.printf("Nhap tua CD: ");
        sc.nextLine();
        tuaCD = sc.nextLine();
        setTuaCD(tuaCD);

        do {
            System.out.printf("Nhap so bai hat: ");
            soBaiHat = sc.nextInt();
            if (soBaiHat < 0) {
                System.out.printf("Khong hop le! ");
            }
        } while (soBaiHat <= 0);
        do {
            System.out.print("Nhap gia CD: ");
            giaThanh = sc.nextDouble();
            if (giaThanh < 0) {
                System.out.printf("Khong hop le! ");
            }
        } while (giaThanh < 0);
        CD a = new CD(maCD,tuaCD,soBaiHat,giaThanh);
        for (CD cd : cds) {
            if(cd.getMaCD() == maCD){
                break;
            }else {
                cds.add(a);
            }
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
