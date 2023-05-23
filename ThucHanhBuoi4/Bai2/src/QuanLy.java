import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<KhachHang> list;

    public QuanLy() {
        list = new ArrayList<>();
    }

    public void themGD(KhachHang kh) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu "+ i);
            if(kh instanceof KhachHangVN){
                kh = new KhachHangVN();
                kh.nhap();
            }else if ( kh instanceof KhachHangNuocNgoai){
                kh = new KhachHangNuocNgoai();
                kh.nhap();
            }
            list.add(kh);
        }
    }

    public void xuatDS(){
        for (KhachHang kh : list){
            System.out.println(kh.toString());
            System.out.println("Thanh tien: "+ kh.thanhTien());
        }
    }

    public int demSoLuong(String loai){
        int count = 0;
        for (KhachHang kh : list) {
            if(kh instanceof KhachHangVN && loai.equals("VN")){
                count ++;
            } else if (kh instanceof KhachHangNuocNgoai && loai.equals("nuoc ngoai")) {
                count ++;
            }
        }
        return count;
    }
    public double tinhTBThanhTien(){
        double tongThanhTien = 0;
        int dem = 0;
        for(KhachHang gd : list){
            if (gd instanceof KhachHangNuocNgoai){
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
        for (KhachHang gd : list){
            if(gd.getNgayRaHoaDon().equals(LocalDate.now())){
                System.out.println(gd.toString());
                System.out.println("Thanh tien: "+ gd.thanhTien());
            }
        }
    }

}
