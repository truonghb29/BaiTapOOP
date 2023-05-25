import java.util.Scanner;

class KhachHang {
    private String cmnd;
    private String ten;
    private String gaDen;
    private double giaTien;

    public KhachHang(String cmnd, String ten, String gaDen, double giaTien) {
        this.cmnd = cmnd;
        this.ten = ten;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    public KhachHang() {
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getCMND() {
        return cmnd;
    }

    public String getTen() {
        return ten;
    }

    public String getGaDen() {
        return gaDen;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập CMND khách hàng: ");
        cmnd = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        ten = sc.nextLine();
        System.out.print("Nhập ga đến: ");
        gaDen = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        giaTien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "cmnd=" + cmnd +
                ", ten='" + ten + '\'' +
                ", gaDen='" + gaDen + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}
