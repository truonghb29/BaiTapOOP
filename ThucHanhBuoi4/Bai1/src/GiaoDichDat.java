import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat() {
    }

    public GiaoDichDat(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiDat) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double thanhTien() {
        if (loaiDat.equals("A") ) {
            return getDienTich() * getDonGia() * 1.5;
        } else {
            return getDonGia() * getDienTich();
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nLoai dat: "+ loaiDat;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap loai dat (A/B/C): ");
        loaiDat = sc.nextLine();
    }
}
