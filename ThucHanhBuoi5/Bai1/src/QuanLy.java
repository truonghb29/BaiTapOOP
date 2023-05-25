import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<PhongHoc> danhSachPhongHoc;

    public QuanLy() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public void them(PhongHoc phongHoc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap lan thu " + i);
            PhongHoc newPhongHoc = null;

            if (phongHoc instanceof PhongLyThuyet) {
                newPhongHoc = new PhongLyThuyet();
                newPhongHoc.nhap();
            } else if (phongHoc instanceof PhongMayTinh) {
                newPhongHoc = new PhongMayTinh();
                newPhongHoc.nhap();
            } else if (phongHoc instanceof PhongThiNghiem) {
                newPhongHoc = new PhongThiNghiem();
                newPhongHoc.nhap();
            }

            boolean trungMaPhong = false;
            for (PhongHoc ph : danhSachPhongHoc) {
                if (ph.getMaPhong().equals(newPhongHoc.getMaPhong())) {
                    trungMaPhong = true;
                    break;
                }
            }

            if (trungMaPhong) {
                System.out.println("Phong hoc ton tai. Khong them vao danh sach");
            } else {
                danhSachPhongHoc.add(newPhongHoc);
                System.out.println("Them thanh cong");
            }
        }
    }


    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equalsIgnoreCase(maPhong)) {
                return phongHoc;
            }
        }
        return null;
    }

    public void inToanBoDanhSach() {
        System.out.println("Danh sach phong hoc");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        System.out.println("Danh sach phong dat chuan");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh) {
                if (phongHoc.KTDatChuan()) {
                    System.out.println(phongHoc.toString());
                }
            } else if (phongHoc instanceof PhongLyThuyet) {
                if (phongHoc.KTDatChuan()) {
                    System.out.println(phongHoc.toString());
                }
            }else if (phongHoc instanceof PhongThiNghiem) {
                if (phongHoc.KTDatChuan()) {
                    System.out.println(phongHoc.toString());
                }
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(this.danhSachPhongHoc, new Comparator<PhongHoc>() {

            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                int i = o1.getDayNha().compareTo(o2.getDayNha());
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
    }

    public void sapXepTheoDienTich() {
        Collections.sort(this.danhSachPhongHoc, new Comparator<PhongHoc>() {
                    @Override
                    public int compare(PhongHoc o1, PhongHoc o2) {
                        int i = (int) (o1.getDienTich() - o2.getDienTich());
                        if (i < 0) {
                            return 1;
                        } else if (i == 0) {
                            return 0;
                        }
                        return -1;
                    }
                }
        );
    }

    public void sapXepTheoSoBongDen() {
        Collections.sort(this.danhSachPhongHoc, new Comparator<PhongHoc>() {
                    @Override
                    public int compare(PhongHoc o1, PhongHoc o2) {
                        int i = (o1.getSoLuongDen() - o2.getSoLuongDen());
                        if (i < 0) {
                            return -1;
                        } else if (i == 0) {
                            return 0;
                        }
                        return 1;
                    }
                }
        );
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        PhongHoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc != null && phongHoc instanceof PhongMayTinh) {
            PhongMayTinh phongMayTinh = (PhongMayTinh) phongHoc;
            phongMayTinh.setSoLuongMayTinh(phongMayTinh.getSoLuongMayTinh() + soMayTinhMoi);
            System.out.println("Cập nhật số máy tính thành công.");
        } else {
            System.out.println("Không tìm thấy phòng học hoặc phòng học không phải là phòng máy tính.");
        }
    }

    public void xoaPhongHoc(String maPhong) {
        Scanner sc = new Scanner(System.in);
        PhongHoc phongHoc = timPhongHoc(maPhong);
        System.out.printf("Ban co chac la muon xoa phong khong (Y/N): ");
        String a = sc.nextLine();
        if (a.equalsIgnoreCase("Y")) {
            if (phongHoc != null) {
                danhSachPhongHoc.remove(phongHoc);
                System.out.println("Xóa phòng học thành công.");
            } else {
                System.out.println("Không tìm thấy phòng học trong danh sách.");
            }
        }

    }

    public int tongPhongHoc() {
        return danhSachPhongHoc.size();
    }

    public void inDanhSachPhongMayCo60May() {
        System.out.println("Danh sách các phòng máy có 60 máy:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoLuongMayTinh() == 60) {
                System.out.println(phongHoc.toString());
            }
        }
    }

    public void xuatten() {
        System.out.println("Ten: Nguyen Thanh Truong");
        System.out.println("MSSV: 1050080082");
    }

    public void MENU() {
        System.out.printf("------QUAN LY PHONG HOC------\n" +
                "1.Them phong hoc\n" +
                "2.Tim phong hoc\n" +
                "3.In toan bo danh sach\n" +
                "4.In danh sach phong hoc dat chuan\n" +
                "5.Sap xep\n" +
                "6.Cap nhat so may tinh\n" +
                "7.Xoa phong hoc\n" +
                "8.In tong so phong hoc\n" +
                "9.In danh sach phong may co tren 60 may\n" +
                "0.Thoat khoi chuong trinh\n");
    }
}
