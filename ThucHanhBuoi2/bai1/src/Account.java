import java.security.PublicKey;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private double soTien;
    private long soTK;
    private String tenTK;
    private String trangThai;
    final double laiSuat = 0.035;
    Locale local = new Locale("vi", "vn");
    NumberFormat format = NumberFormat.getCurrencyInstance(local);

    public Account() {
        this.soTien = 50;
        this.soTK = 999999;
        this.tenTK = "Chua xac dinh";
        this.trangThai = "";
    }

    public Account(long soTK, String tenTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = 50;
    }

    public Account(double soTien, long soTK, String tenTK, String trangThai) {
        this.soTien = soTien;
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.trangThai = trangThai;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = soTien;
        } else {
            this.soTien = 50;
            System.out.println("Khong hop le!So tien da duoc dat mac dinh");
        }

    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        if (soTK > 0 && soTK != 999999) {
            this.soTK = soTK;
        } else {
            this.soTK = 999999;
            System.out.println("Khong hop le! So Tk da duoc gan mac dinh!");
        }

    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        if (tenTK != "") {
            this.tenTK = tenTK;
        } else {
            this.tenTK = "Chua xac dinh";
            System.out.println("Ten tai khoan khong hop le!");
        }

    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTien=" + soTien +
                ", soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten tai khoan: ");
        tenTK = sc.nextLine();
        setTenTK(tenTK);
        System.out.printf("Nhap so tai khoan: ");
        soTK = sc.nextLong();
        setSoTK(soTK);
        System.out.printf("Nhap so tien: ");
        soTien = sc.nextDouble();
        setSoTien(soTien);
    }
}
