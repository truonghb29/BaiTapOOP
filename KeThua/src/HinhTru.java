import java.util.Scanner;

public class HinhTru extends HinhTron {

    public float chieuCao;

    public HinhTru() {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich() {
        theTich =banKinh * banKinh * PI * chieuCao;
    }
}
