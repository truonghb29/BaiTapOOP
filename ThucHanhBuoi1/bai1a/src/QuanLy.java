import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<Vehicle> DSxe;

    public QuanLy() {
        DSxe = new ArrayList<>();
    }

    public void them(Vehicle vh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            vh = new Vehicle();
            vh.nhap();
            DSxe.add(vh);
        }
    }

    public void xuatDS() {
        System.out.format("%-30s %-30s %30s %30s %30s\n",
                "Ten chu xe",
                "Loai xe",
                "Dung tich",
                "Tri gia",
                "Thue phai nop");
        System.out.println("===============================================================================================================================================================");
        for (Vehicle ds : DSxe) {
            System.out.format("%-30s %-30s %30s %30.2f %30.2f\n",
                    ds.getTenChuXe(),
                    ds.getLoaiXe(),
                    ds.getDungTich(),
                    ds.getTriGia(),
                    ds.getThue()
            );
        }
    }
    public void menu(){
        System.out.printf("-----QUAN LY XE-----\n" +
                "1. Nhap thong tin\n" +
                "2. Xuat ban ke khai\n" +
                "3. Thoat\n");
    }
}
