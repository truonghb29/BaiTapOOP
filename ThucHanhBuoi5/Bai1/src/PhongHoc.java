import java.util.Scanner;

public class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soLuongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soLuongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soLuongDen = soLuongDen;
    }

    public PhongHoc() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoLuongDen() {
        return soLuongDen;
    }

    public void setSoLuongDen(int soLuongDen) {
        this.soLuongDen = soLuongDen;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.printf("Nhap day nha: ");
        dayNha = sc.nextLine();
        System.out.printf("Nhap dien tich: ");
        dienTich = sc.nextDouble();
        System.out.printf("Nhap so luong den: ");
        sc.nextLine();
        soLuongDen = sc.nextInt();
    }

    @Override
    public String toString() {
        return "PhongHoc{" +
                "maPhong='" + maPhong + '\'' +
                ", dayNha='" + dayNha + '\'' +
                ", dienTich=" + dienTich +
                ", soLuongDen=" + soLuongDen +
                '}';
    }

    public boolean KTDatChuan(){
        if( dienTich/soLuongDen <= 10){
            return true;
        }else
            return false;
    }


}