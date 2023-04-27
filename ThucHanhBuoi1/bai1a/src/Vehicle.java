import java.util.Scanner;

public class Vehicle {
    private String tenChuXe, loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThue() {
        if (this.dungTich < 100) {
            return (this.triGia * 1) / 100;
        } else if (this.dungTich >= 100 && this.dungTich <= 200) {
            return (this.triGia * 3)/ 100;
        } else {
            return (this.triGia * 5) / 100;
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.printf("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.printf("Nhap dung tich: ");
        dungTich = sc.nextInt();
        System.out.printf("Nhap gia xe: ");
        triGia = sc.nextDouble();
    }

}
