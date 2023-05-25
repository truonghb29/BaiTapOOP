import java.util.Scanner;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String tenPhong, String diaChi, double dienTich, int soLuongDen, boolean coMayChieu) {
        super(tenPhong, diaChi, dienTich, soLuongDen);
        this.coMayChieu = coMayChieu;
    }

    public PhongLyThuyet() {
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Co may chieu khong (true/false): ");
        coMayChieu = sc.nextBoolean();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCo may chieu khong: "+coMayChieu;
    }

    @Override
    public boolean KTDatChuan(){
        if( (getDienTich()/getSoLuongDen()) <= 10 && coMayChieu == true){
            return true;
        }else
            return false;
    }
}


