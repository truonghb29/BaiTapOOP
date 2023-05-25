import java.util.Scanner;

public class PhongMayTinh extends PhongHoc {
    private int soLuongMayTinh;

    public PhongMayTinh(String tenPhong, String diaChi, double dienTich, int soLuongDen, int soLuongMayTinh) {
        super(tenPhong, diaChi, dienTich, soLuongDen);
        this.soLuongMayTinh = soLuongMayTinh;
    }

    public PhongMayTinh() {
    }

    public int getSoLuongMayTinh() {
        return soLuongMayTinh;
    }

    public void setSoLuongMayTinh(int soLuongMayTinh) {
        this.soLuongMayTinh = soLuongMayTinh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong may tinh: ");
        soLuongMayTinh = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nSo luong may tinh: " + soLuongMayTinh;
    }

    @Override
    public boolean KTDatChuan(){
        if( (getDienTich()/getSoLuongDen() <= 10) && getDienTich()/soLuongMayTinh <= 1.5){
            return true;
        }else
            return false;
    }
}

