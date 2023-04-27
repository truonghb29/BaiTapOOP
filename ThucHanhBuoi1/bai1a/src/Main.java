import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy a = new QuanLy();
        Vehicle vh = new Vehicle();
        Scanner sc = new Scanner(System.in);
        int luachon = 0;

        do{
            a.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                vh = new Vehicle();
                a.them(vh);
            } else if (luachon == 2) {
                a.xuatDS();
            }
        }while (luachon !=3);
    }
}