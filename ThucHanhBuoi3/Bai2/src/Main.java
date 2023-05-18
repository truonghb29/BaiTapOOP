import java.util.*;

public class Main {
    public static void main(String[] args) {
        QuanLyKho a = new QuanLyKho();
        Scanner sc = new Scanner(System.in);
        HangHoa hh;
        int luaChon = 0;
        do {
            a.MENU();
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("[1]In DSCD");
                System.out.printf("1.In tat ca hang hoa" +
                        "2.In hang thuc pham\n" +
                        "3.In hang dien may\n" +
                        "4.In hang sanh su\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i == 1) {
                    a.xuatHH();
                }
            } else if (luaChon == 2) {
                System.out.println("[2]Them hang hoa");
                System.out.printf("1.Them hang thuc pham\n" +
                        "2.Them hang dien may\n" +
                        "3.Them hangsanh su\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if (i == 1) {
                    hh = new HangThucPham();
                    a.themHH(hh);
                } else if (i == 2) {
                    hh = new HangDienMay();
                    a.themHH(hh);
                } else if (i == 2) {
                    hh = new HangSanhSu();
                    a.themHH(hh);
                }
            }
        } while (luaChon != 0);
    }
}