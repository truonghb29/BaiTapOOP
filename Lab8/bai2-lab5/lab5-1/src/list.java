import java.util.ArrayList;
import java.util.Scanner;

public class list {
    ArrayList<Double> list;

    public list(){
        list = new ArrayList<>();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.printf("Nhap so: ");
            double x = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Nhap them (Y/N)?");
            if(sc.nextLine().equals("N")){
                break;
            }
        }
    }
    public void xuat(){
        for(double i : list){
            System.out.printf(i+ "\t");
        }
    }
}
