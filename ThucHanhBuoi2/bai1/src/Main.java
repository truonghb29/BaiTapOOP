import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        AccountList a = new AccountList();
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            a.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                a.themTk(acc);
            } else if (luachon == 2) {
                System.out.println("So tai khoan hien co la: "+ a.soLuong());
            } else if (luachon == 3) {
                a.xuat();
            } else if (luachon == 4) {
                a.napTien();
            } else if (luachon == 5) {
                a.rutTien();
            } else if (luachon == 6) {
                a.chuyenKhoan();
            } else if (luachon == 7) {
                System.out.printf("Nhap stk muon xoa: ");
                long stk = sc.nextLong();
                a.xoaTk(stk);
            } else if (luachon == 8) {
                System.out.printf("Nhap stk muon tim: ");
                long stk = sc.nextLong();
                a.timTK(stk);

            }
        } while (luachon != 0);
    }
}