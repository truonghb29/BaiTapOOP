
import java.util.Scanner;

public class HangDienMay extends HangHoa {

    private int thangBH;
    private double congSuat;



    public HangDienMay() {
    }


    public HangDienMay(int thangBH, double congSuat, String maHang, String tenHang, double soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thangBH = thangBH;
        this.congSuat = congSuat;
    }

    public int getThangBH() {
        return thangBH;
    }

    public void setThangBH(int tgBH) {
        if (thangBH > 0 && thangBH ==0)
            this.thangBH = thangBH;
        else
            System.out.println("Thang bao hanh khong hop le!\n"
                    + "Vui long nhap lai!");
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        if (congSuat>0)
            this.congSuat = congSuat;
        else
            System.out.println("Cong suat khong hop le!\n"
                    + "Vui long nhap lai!");
    }
    
    @Override
    public void VAT() {
         double vat = donGia + ((donGia*10)%100);
    }

    @Override
    public void DanhGia() {
        if (soLuongTon < 3)
            System.out.println("Muc do ban: Ban duoc!");
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("Nhap thang bao hanh: ");
            thangBH = sc.nextInt();
        } while (thangBH < 0);
        
        do {
            System.out.println("Nhap cong suat: ");
            congSuat = sc.nextDouble();
        } while (congSuat < 0);
        
    }

    
    
    
    
}