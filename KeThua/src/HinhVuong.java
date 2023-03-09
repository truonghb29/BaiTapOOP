import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten="Hinh vuong";
    }

    public void nhapCanh() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap canh: ");
        float canh = sc.nextFloat();
    }
}
