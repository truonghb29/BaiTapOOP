import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CDList cd = new CDList();
        CD cd1 = new CD();
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            cd.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                cd1 = new CD();
                cd.them(cd1);
            } else if (luachon == 2) {
                System.out.println("So tai khoan hien co la: "+ cd.count());
            } else if (luachon == 3) {
                System.out.println("Tong gia thanh CD la: "+ cd.tongGia());
            } else if (luachon == 4) {
                cd.sapXepCDTheoGia();
                cd.inDSCD();
            } else if (luachon == 5) {
                cd.sapXepCDTheoTua();
                cd.inDSCD();
            } else if (luachon == 6) {
                cd.inDSCD();
            }
        } while (luachon != 0);
    }
}