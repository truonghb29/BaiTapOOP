import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        QuanLyKhachHang a = new QuanLyKhachHang();
        KhachHang khachHang;
        a.laydulieu();
        Scanner scanner = new Scanner(System.in);
        int luachon =0;
        do {
            System.out.printf("------QUAN LY-------\n" +
                    "1.Them mot khach hang vao hang doi mua ve\n" +
                    "2.Ban 1 ve cho khach hang\n" +
                    "3.Hien thi danh sach khach hang\n" +
                    "4.Huy 1 khach hang ra khoi danh sach\n" +
                    "5.Thong ke\n" +
                    "6.Luu danh sach vao file\n" +
                    "7.Hien thi cac ga dang cho mua ve\n" +
                    "0.Thoat khoi chuong trinh\n");
            System.out.print("Nhap lua chon: ");
            luachon = scanner.nextInt();
            scanner.nextLine();
            if (luachon == 1) {
                khachHang = new KhachHang();
                a.themKhachHang(khachHang);
            } else if (luachon == 2) {
                System.out.print("Nhap CMND khach hang: ");
                String cmndBanVe = scanner.nextLine();
                a.banVe(cmndBanVe);
            } else if (luachon == 3) {
                a.hienThiDanhSachKhachHang();
            } else if (luachon == 4) {
                System.out.print("Nhap CMND khach hang: ");
                String cmndHuy = scanner.nextLine();
                a.huyKhachHang(cmndHuy);
            } else if (luachon == 5) {
                a.thongKe();
            } else if (luachon == 6) {
                System.out.print("Nhap ten file: ");
                String tenFile = scanner.nextLine();
                a.luuDanhSachVaoFile(tenFile);
            } else if (luachon == 7) {
                a.hienThiCacGaChoMuaVe();
            }
        }while (luachon != 0);
    }
}
