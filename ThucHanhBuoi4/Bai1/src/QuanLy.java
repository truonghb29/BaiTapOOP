import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<GiaoDich> list;

    public QuanLy() {
        list = new ArrayList<>();
    }

    public void themGD(GiaoDich gd) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu "+ i);
            if(gd instanceof GiaoDichDat){
                gd = new GiaoDichDat();
                gd.nhap();
            }else if ( gd instanceof GiaoDichNha){
                gd = new GiaoDichNha();
                gd.nhap();
            }
            list.add(gd);
        }
    }

    public void xuatDS(){
        for (GiaoDich gd : list) {
            System.out.println(gd.toString());
            System.out.println("Thanh tien: "+ gd.thanhTien());
        }
    }

    public int demSoLuong(String loai){
        int count = 0;
        for (GiaoDich gd : list) {
            if(gd instanceof GiaoDichDat && loai.equals("dat")){
                count ++;
            } else if (gd instanceof GiaoDichNha && loai.equals("nha")) {
                count ++;
            }
        }
        return count;
    }

    public double tinhTBThanhTien(){
        double tongThanhTien = 0;
        int dem = 0;
        for(GiaoDich gd : list){
            if (gd instanceof GiaoDichDat){
                tongThanhTien += gd.thanhTien();
                dem++;
            }
        }
        if(dem != 0){
            return tongThanhTien/dem;
        }else {
            return 0;
        }
    }

    public void xuatGDNow(){
        for (GiaoDich gd : list){
            if(gd.getNgayGD().equals(LocalDate.now())){
                System.out.println(gd.toString());
                System.out.println("Thanh tien: "+ gd.thanhTien());
            }
        }
    }
}
