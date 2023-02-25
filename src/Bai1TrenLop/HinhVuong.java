package Bai1TrenLop;

public class HinhVuong {
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return this.canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double dienTich() {
        return this.canh * this.canh;
    }

    public double chuVi() {
        return this.canh * 4;
    }

    public String toString() {
        return "HinhVuong{ " + "Canh = " + canh + ", dienTich = " + dienTich() + ", chuVi = " + chuVi() + '}';
    }

}
