
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy a = new QuanLy();
        PhongHoc phongHoc;
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        a.xuatten();
        do {
            a.MENU();
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.printf("1.Them phong ly thuyet\n" +
                        "2.Them phong may tinh\n" +
                        "3.Them phong thi nghiem\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i == 1) {
                    phongHoc = new PhongLyThuyet();
                    a.them(phongHoc);
                } else if (i == 2) {
                    phongHoc = new PhongMayTinh();
                    a.them(phongHoc);
                } else if (i == 3) {
                    phongHoc = new PhongThiNghiem();
                    a.them(phongHoc);
                }
            } else if (luaChon == 2) {
                System.out.printf("Nhap ma phong can tim: ");
                sc.nextLine();
                String ma = sc.nextLine();
                System.out.println(a.timPhongHoc(ma).toString());
            } else if (luaChon == 3) {
                a.inToanBoDanhSach();
            } else if (luaChon == 4) {
                a.inDanhSachPhongHocDatChuan();
            } else if (luaChon == 5) {
                System.out.println("[5] Sap xep");
                System.out.printf(
                        "1.Sap xep theo day nha\n" +
                                "2.Sap xep theo dien tich\n" +
                                "3.Sap xep theo so luong den\n");
                int i = sc.nextInt();
                if (i == 1) {
                    a.sapXepTheoDayNha();
                    a.inToanBoDanhSach();
                } else if (i == 2) {
                    a.sapXepTheoDienTich();
                    a.inToanBoDanhSach();
                } else if (i == 3) {
                    a.sapXepTheoSoBongDen();
                    a.inToanBoDanhSach();
                }
            } else if (luaChon == 6) {
                System.out.printf("Nhap ma phong can them may tinh: ");
                sc.nextLine();
                String ma = sc.nextLine();
                System.out.printf("Nhap so luong can them: ");
                int soluong = sc.nextInt();
                a.capNhatSoMayTinh(ma,soluong);
            } else if (luaChon == 7) {
                System.out.printf("Nhap ma phong can xoa: ");
                sc.nextLine();
                String ma = sc.nextLine();
                a.xoaPhongHoc(ma);
            } else if (luaChon == 8) {
                System.out.println("Tong so phong hoc la: " + a.tongPhongHoc());
            } else if (luaChon == 9) {
                a.inDanhSachPhongMayCo60May();
            }
        } while (luaChon != 0);
    }
}
