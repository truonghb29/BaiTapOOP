import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh, thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so phat hanh: ");
        soPhatHanh = sc.nextInt();
        System.out.printf("Nhap thang phat hanh: ");
        do{
            thangPhatHanh = sc.nextInt();
            if (thangPhatHanh > 12 && thangPhatHanh <= 0){
                System.out.printf("Khong hop le! Nhap lai: ");
            }
        }while (thangPhatHanh > 12 && thangPhatHanh <= 0);
    }
}
