import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    private double getThueNhapKhau(double donGia) {
        return donGia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("San pham { Ten san pham: " + tenSP + "; Don gia: " + donGia + "; Giam gia: " + giamGia
                + "; Thue nhap khau: " + getThueNhapKhau(donGia) + " }\n");
    }

}

