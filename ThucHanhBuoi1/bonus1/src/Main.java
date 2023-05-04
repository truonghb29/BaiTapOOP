import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    ArrayList<SinhVien> svs;

    public Main() {
        this.svs = new ArrayList<>();
    }

    public void them(SinhVien sv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            sv = new SinhVien();
            sv.nhap();
            svs.add(sv);
        }
    }

    public void xuatDS() {
        System.out.format("%-30s %-30s %-20s %-20s\n",
                "Ma sinh vien",
                "Ten sinh vien",
                "Dia chi",
                "So dien thoai");
        System.out.println("============================================================================================================");
        for (SinhVien sv : svs) {
            System.out.format("%-30s %-30s %-20s %-20s\n",
                    sv.getMaSV(),
                    sv.getTenSV(),
                    sv.getDiaChi(),
                    sv.getSDT()
            );
        }
    }
    public void sapXep(){
        Collections.sort(this.svs, new Comparator<SinhVien>() {
                    @Override
                    public int compare(SinhVien o1, SinhVien o2) {
                        int i = (o1.getMaSV() - o2.getMaSV());
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
    public void menu() {
        System.out.printf("-----QUAN LY XE-----\n" +
                "1. Nhap thong tin\n" +
                "2. Xuat thong tin\n" +
                "3. Thoat\n");
    }
    public static void main(String[] args) {
        Main a = new Main();
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        do{
            a.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                a.them(sv);
            }else if( luachon ==2 ) {
                a.sapXep();
                a.xuatDS();
            }
        }while(luachon != 0);
    }
}