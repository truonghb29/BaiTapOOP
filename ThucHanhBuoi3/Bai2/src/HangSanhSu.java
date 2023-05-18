
import java.time.LocalDate;
import java.util.Scanner;

public class HangSanhSu extends HangHoa 
{
    private String nhaSX;
    private LocalDate ngayNhapKho = LocalDate.now();
   

    public HangSanhSu() {
    }

    public HangSanhSu(String nhaSX, LocalDate ngayNhapKho, String maHang, String tenHang, double soLuongTon, double donGia) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    
    
    @Override
    public void VAT() {
         double vat = donGia + ((donGia*10)%100);
    }

    @Override
    public void DanhGia() {
        if(soLuongTon > 50 && ngayNhapKho.isBefore(ngayNhapKho.plusDays(10))==true)
            System.out.println("Muc do ban: Ban Cham!");
}

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Nhap nha san xuat: ");
        nhaSX = sc.nextLine();
        int ngay;
        int thang;
        int nam;
        do{
            System.out.println("Nhap ngay nhap khpo: ");
            ngay = sc.nextInt();
            if (ngay<0 && ngay>31)
            {
                System.out.print("Nhap khong hop le! Vui long nhap lai: ");

            }
        }while(ngay<0 || ngay>31);
        
        do{
            System.out.println("Nhap thang nhap kho: ");
            thang = sc.nextInt();
            if (thang<0 && thang>31)
            {
                System.out.print("Nhap khong hop le! Vui long nhap lai: ");

            }
        }while(thang<0 || thang>12);
        
        do{
            System.out.println("Nhap nam nhap:");
            nam = sc.nextInt();
            
            if (nam<0 && nam>2023)
            {
                System.out.print("Nhap khong hop le! Vui long nhap lai: ");
            }
        }while(nam>2023 || nam<0);
        
        ngayNhapKho = LocalDate.of(nam, thang, ngay);
        
        
    }

    
    
}