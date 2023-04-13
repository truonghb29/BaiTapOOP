import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSach {

    double gia;
    String ten;

    ArrayList<DanhSach> list;
    public DanhSach (){
        list = new ArrayList<>();

    }

    public DanhSach(String ten, double gia) {
        this.gia = gia;
        this.ten = ten;
    }

    public void nhap(){
        Scanner sc = new Scanner (System.in);
        while(true){
            System.out.println("Nhap ten san pham: ");
            String ten = sc.nextLine();
            System.out.println("Nhap gia: ");
            Double gia = sc.nextDouble();
            DanhSach sp = new DanhSach(ten,gia);
            list.add(sp);

            System.out.println("Nhap them (y/n)?");
            sc.nextLine();
            if(sc.nextLine().equals("n")){
                break;
            }
        }
    }
    public void xuat(){
        for (DanhSach i: list){
            System.out.println(i);
        }
    }

    public void sapXep() {
        Collections.sort(this.list, new Comparator<DanhSach >() {
            @Override
            public int compare(DanhSach o1, DanhSach o2) {
                return Double.compare(o1.gia, o2.gia);
//                        int i = (int) (o1.gia - o2.gia);
//                        if (i < 0) {
//                            return 1;
//                        } else if (i == 0) {
//                            return 0;
//                        }
//                        return -1;
            }
        });
        Collections.reverse(list);

    }

    @Override
    public String toString() {
        return "DanhSach{" + "gia=" + gia + ", ten=" + ten + '}';
    }

    public void timVaXoa(String ten){
        for (DanhSach i: list){
            if(i.equals(ten)){
                list.remove(i);
                break;
            }

        }

    }
    public void giaTB(){
        double giatb = 0;
        for(DanhSach i: list){
            giatb += i.gia;

        }
        System.out.println("Gia trung binh: " + giatb/list.size());
    }
    public void menu(){
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("1.Nhap \n"
                +"2.Sap xep giam dan va xuat \n"
                +"3.Tim va xoa \n"
                +"4.Xuat gia trung binh \n");
        do{
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                nhap();
            }else if(luachon == 2){
                sapXep();
                xuat();
            }else if(luachon == 3){
                System.out.println("Nhap ten: ");
                sc.nextLine();
                String ten = sc.nextLine();
                timVaXoa(ten);

            }else if(luachon == 4){
                giaTB();
            }
        }while(luachon !=6);

    }

}