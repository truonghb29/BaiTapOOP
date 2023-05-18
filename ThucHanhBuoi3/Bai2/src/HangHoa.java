import java.util.Scanner;

public abstract class HangHoa {
    protected String maHH;
    protected String tenHH;
    protected double soLuongTon;
    protected double donGia;

    public HangHoa() {
    }
    
    public HangHoa(String maHH, String tenHH, double soLuongTon, double donGia) {
         this.maHH = maHH;
         this.tenHH = tenHH;
         this.soLuongTon = soLuongTon;
         this.donGia = donGia;
     }

    public String getMaHH() {
        return this.maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return this.tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public double getSoLuongTon() {
        return this.soLuongTon;
    }


    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }


    abstract public void VAT();
    abstract public void DanhGia();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma hang hoa: ");
        do {
            maHH = sc.nextLine();
            if (maHH.equals(null)) {
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        } while (maHH.equals(null));
        System.out.printf("Nhap ten hang hoa: ");
        do {
            tenHH = sc.nextLine();
            if (tenHH.equals(null)) {
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        } while (tenHH.equals(null));
        System.out.printf("Nhap so luong ton: ");
        do {
            soLuongTon = sc.nextInt();
            if (soLuongTon < 0) {
                System.out.printf("Khong hop le! Nhap lai: ");
           }
       } while (soLuongTon < 0);
       System.out.printf("Nhap don gia: ");
       do {
           donGia = sc.nextInt();
           if (donGia <= 0) {
               System.out.printf("Khong hop le! Nhap lai: ");
           }
       } while (donGia <= 0);
   }





}