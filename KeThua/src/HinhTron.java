import java.nio.channels.Pipe;
import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        ten = "Hinh Tron";
    }

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = (banKinh * 2) * PI;
    }

    public void tinhDienTich() {
        dienTich = banKinh * banKinh * PI;
    }
}
