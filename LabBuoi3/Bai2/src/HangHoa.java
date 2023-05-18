import java.util.Scanner;

public class HangHoa {
    private String maHH;
    private String tenHH;
    private int soLuongTon;
    private double donGia;

    public String getMaHH() {
        return maHH;
    }


    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getSoLuongTon() {
        return soLuongTon;
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
