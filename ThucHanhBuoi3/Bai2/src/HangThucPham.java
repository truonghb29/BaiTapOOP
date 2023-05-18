import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham extends HangHoa{
    private LocalDate ngaySanXuat,ngayHetHan;
    private String nhaCungCap;

 

    public HangThucPham() {
    }

    public HangThucPham(LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }


    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
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
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ngay san xuat: ");
        int ngay = 0;
        do {
             ngay = sc.nextInt();
            if(ngay < 0 || ngay > 31){
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        }while (ngay < 0 || ngay > 31);
        System.out.printf("Nhap thang san xuat: ");
        int thang = 0;
        do {
            thang = sc.nextInt();
            if(thang < 0 || thang > 12){
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        }while (thang < 0 || thang > 12);
        System.out.printf("Nhap nam san xuat: ");
        int nam = 0;
        do {
            nam = sc.nextInt();
            if(nam < 0 || nam > 2023){
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        }while (nam < 0 || nam > 2023);
        ngaySanXuat = LocalDate.of(nam,thang,ngay);

        do {
            System.out.printf("Nhap ngay het han: ");
            int ngayhh = 0;
            do {
                ngayhh = sc.nextInt();
                if(ngayhh < 0 || ngayhh > 31){
                    System.out.printf("Khong hop le! Nhap lai: ");
                }
            }while (ngayhh < 0 || ngayhh > 31);
            System.out.printf("Nhap thang het han: ");
            int thanghh = 0;
            do {
                thanghh = sc.nextInt();
                if(thanghh < 0 || thanghh > 12){
                    System.out.printf("Khong hop le! Nhap lai: ");
                }
            }while (thanghh < 0 || thanghh > 12);
            System.out.printf("Nhap nam het han: ");
            int namhh = 0;
            do {
                nam = sc.nextInt();
                if(namhh < 0 || namhh > 2023){
                    System.out.printf("Khong hop le! Nhap lai: ");
               }
           }while (namhh < 0 || namhh > 2023);
           ngayHetHan = LocalDate.of(nam,thang,ngay);
           if(ngayHetHan.isBefore(ngaySanXuat)){
               System.out.println("Ngay het han khong hop le! Vui long nhap lai:");
           }
       }while (ngayHetHan.isBefore(ngaySanXuat));
    }
}