import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String tenSV, diaChi;
    private String SDT;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, String diaChi, String SDT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", tenSV='" + tenSV + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", SDT='" + SDT + '\'' +
                '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
        System.out.printf("Nhap ten sinh vien: ");
        sc.nextLine();
        tenSV = sc.nextLine();
        System.out.printf("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.printf("Nhap SDT gom 9 chu so: ");
        SDT = sc.nextLine();
    }

    public int compareTo(SinhVien o) {
        return this.maSV = (o.maSV);
    }
}
