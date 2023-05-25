import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class QuanLyKhachHang {
    private ArrayList<KhachHang> danhSachKhachHang;
    private ArrayList<KhachHang> DSMuaVe;

    public void laydulieu() {
        try (BufferedReader br = new BufferedReader(new FileReader("danhsach.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String cmnd = parts[0];
                    String ten = parts[1];
                    String gaDen = parts[2];
                    double giaTien = Double.parseDouble(parts[4]);
                    KhachHang khachHang = new KhachHang(cmnd, ten, gaDen, giaTien);
                    danhSachKhachHang.add(khachHang);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public QuanLyKhachHang() {
        danhSachKhachHang = new ArrayList<>();
    }

    public void themKhachHang(KhachHang khachHang) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap lan thu " + i);
            khachHang = new KhachHang();
            khachHang.nhap();
            danhSachKhachHang.add(khachHang);
        }

    }

    public void banVe(String cmnd) {
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang.getCMND().equals(cmnd)) {
                System.out.println("Ban ve cho khach hang " + khachHang.getTen() + " thanh cong.");
                danhSachKhachHang.remove(khachHang);
                DSMuaVe.add(khachHang);
                return;
            }
        }
        System.out.println("Khong tim thay khach hang co CMND " + cmnd);
    }

    public void hienThiDanhSachKhachHang() {
        if (danhSachKhachHang.isEmpty()) {
            System.out.println("Danh sach khach hang trong.");
            return;
        }

        System.out.println("Danh sach khach hang:");
        for (KhachHang khachHang : danhSachKhachHang) {
            System.out.println(khachHang.toString());
        }
    }

    public void huyKhachHang(String cmnd) {
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang.getCMND().equals(cmnd)) {
                danhSachKhachHang.remove(khachHang);
                System.out.println("Huy khach hang " + khachHang.getTen() + " thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay khach hang có CMND " + cmnd);
    }

    public void luuDanhSachVaoFile(String tenFile) {
        try {
            FileOutputStream fos = new FileOutputStream(tenFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(danhSachKhachHang);
            oos.close();
            fos.close();
            System.out.println("Luu thanh cong");
        } catch (IOException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    public void hienThiCacGaChoMuaVe() {
        Set<String> cacGaChoMuaVe = new HashSet<>();
        for (KhachHang khachHang : danhSachKhachHang) {
            cacGaChoMuaVe.add(khachHang.getGaDen());
        }

        if (cacGaChoMuaVe.isEmpty()) {
            System.out.println("Khong co ga nao dang cho mua ve");
        } else {
            System.out.println("Cac ga dang cho ve:");
            for (String ga : cacGaChoMuaVe) {
                System.out.println(ga);
            }
        }
    }

    public void thongKe() {
        double tong = 0;
        System.out.println("Co " + danhSachKhachHang.size() + " khach hang dang cho nhan ve!!!!");
        System.out.println("Co " + DSMuaVe.size() + "da nhan duoc ve!!!");
        for (KhachHang kh : DSMuaVe) {
            tong += kh.getGiaTien();
        }
        System.out.println("Tong doanh thu la: "+ tong);
    }
}

