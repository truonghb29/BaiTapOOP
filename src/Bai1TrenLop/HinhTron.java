package Bai1TrenLop;

public class HinhTron {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double dienTich() {
        return this.banKinh * this.banKinh * Math.PI;
    }

    public double chuVi() {
        return (this.banKinh * 2) * Math.PI;
    }

    public String toString() {
        return "HinhTron{" + " banKinh = " + banKinh + ", dienTich = " + dienTich() + ", chuVi = " + chuVi() + '}';
    }
}
