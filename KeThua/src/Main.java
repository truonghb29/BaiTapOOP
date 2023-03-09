public class Main {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron();
        HinhChuNhat hcn= new HinhChuNhat();
        HinhTru h2 = new HinhTru();
        HinhVuong hv = new HinhVuong();

        h1.nhapBanKinh();
        h1.tinhDienTich();
        h1.tinhChuVi();
        h1.inDienTich();
        h1.inChuVi();
        h2.nhapBanKinh();
        h2.nhapChieuCao();
        h2.tinhTheTich();
        h2.inTheTich();
    }
}