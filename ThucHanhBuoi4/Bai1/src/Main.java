import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy a = new QuanLy();
        GiaoDich gd;
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("-----MENU----\n" +
                    "1.Them giao dich\n" +
                    "2.Xuat giao dich\n" +
                    "3.Tong so luong tung loai\n" +
                    "4.Tinh trung binh thanh tien cua giao dich dat\n" +
                    "5.Xuat cac giao dịch ngay hom nay\n" +
                    "0.Thoat\n");
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                System.out.printf("1.Them giao dich dat\n" +
                        "2.Them giao dich nha\n" +
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if(i == 1){
                    gd = new GiaoDichDat();
                    a.themGD(gd);
                } else if (i == 2) {
                    gd = new GiaoDichNha();
                    a.themGD(gd);
                }
            } else if (luachon == 2) {
                a.xuatDS();
            } else if (luachon == 3) {
                System.out.printf("Nhap loai can dem: ");
                sc.nextLine();
                String loai = sc.nextLine();
                System.out.println("So luong la: "+a.demSoLuong(loai));
            }else if (luachon == 4){
                System.out.println("Tong thanh tien la"+ a.tinhTBThanhTien());
            }else if (luachon == 5){
                a.xuatGDNow();
            }
        }while (luachon != 0);
    }
}