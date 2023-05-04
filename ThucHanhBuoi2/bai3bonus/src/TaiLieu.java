import java.util.Scanner;

public class TaiLieu {
    private int maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(int maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma tai lieu: ");
        maTaiLieu = sc.nextInt();
        System.out.printf("Nhap ten NXB: ");
        sc.nextLine();
        tenNXB = sc.nextLine();
        System.out.printf("Nhap so ban phat hanh: ");
        soBanPhatHanh = sc.nextInt();
    }
}
