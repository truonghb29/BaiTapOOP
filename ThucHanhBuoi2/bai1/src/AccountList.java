import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AccountList {
    ArrayList<Account> accList;
    private int count;

    public AccountList() {
        this.accList = new ArrayList<>(10);
        this.count = 0;
    }

    public AccountList(int n) {
        this.accList = new ArrayList<>(n);
        this.count = 0;
    }

    public void themTk(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            acc = new Account();
            acc.nhap();
            accList.add(acc);
        }
    }

    public void xoaTk(long soTK) {
        Iterator<Account> iterator = accList.iterator();
        while (iterator.hasNext()) {
            Account acc = iterator.next();
            if (acc.getSoTK() == soTK) {
                iterator.remove();
                System.out.println("Da xoa tai khoan: " + soTK);
                return;
            }
        }

        System.out.println("Khong tim thay tai khoan " + soTK);
    }

    public void timTK(long soTK) {
        for (Account acc : accList) {
            if (acc.getSoTK() == soTK) {
                System.out.println(acc.toString());
            }
        }
    }

    public int soLuong() {
        return accList.size();
    }

    public void xuat() {
        for (Account acc : accList) {
            System.out.println(acc.toString());
        }
    }

    public void napTien() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        System.out.printf("Nhap so tien nap vao: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.printf("Khong hop le! nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                acc.setSoTien(acc.getSoTien() + soTien);
                System.out.println("Nap tien thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        System.out.printf("Nhap so tien can rut: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.printf("Khong hop le! nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                if (acc.getSoTien() >= soTien) {
                    acc.setSoTien(acc.getSoTien() - soTien);
                    System.out.println("Rut tien thanh cong");
                } else {
                    System.out.println("So tien khong du!");
                }
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void chuyenKhoan() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        System.out.printf("Nhap so tai khoan ban muon chuyen khoan: ");
        int stk2 = sc.nextInt();
        System.out.printf("Nhap so tien ban muon chuyen: ");
        double soTien = 0;
        do {
            soTien = sc.nextDouble();
            if (soTien <= 0) {
                System.out.printf("Khong hop le! nhap lai: ");
            }
        } while (soTien <= 0);
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                acc.setSoTien(acc.getSoTien() - soTien);
                System.out.println("Chuyen tien thanh cong");
            }

        }
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk2) {
                acc.setSoTien(acc.getSoTien() + soTien);
                return;
            }

        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void daoHan() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tai khoan cua ban: ");
        int stk = sc.nextInt();
        for (int i = 0; i < accList.size(); i++) {
            Account acc = accList.get(i);
            if (acc.getSoTK() == stk) {
                acc.setSoTien(acc.getSoTien() + acc.getSoTien() * acc.laiSuat);
                System.out.println("Dao han thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay so tai khoan nay");
    }

    public void menu() {
        System.out.printf("------MENU------\n" +
                "1.Them\n" +
                "2.So tai khoan hien co\n" +
                "3.In tat ca thong tin\n" +
                "4.Nap tien \n" +
                "5.Rut tien\n" +
                "6.Chuyen tien\n" +
                "7.Xoa tai khoan\n" +
                "8.Tim tai khoan\n" +
                "0.Thoat khoi chuong trinh\n");
    }
}
