public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        sp2.nhap();
        sp2.xuat();
        SanPham sp3 = new SanPham("ao thun",50,10);
        sp3.xuat();
        SanPham sp4 = new SanPham("quan jean",100);
        sp4.xuat();
    }
}