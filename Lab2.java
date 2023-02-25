import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2 {

    public static void phuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = (-b) / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }

    public static void phuongTrinhBacHai(double a, double b, double c) {


        if (a == 0) {
            phuongTrinhBacNhat(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    public static double tinhTienDien(double a) {
        double tien;
        if (a <= 50) {
            tien = a * 1000;
            return tien;
        } else {
            tien = 50 * 1000 + (a - 50) * 1200;
            return tien;
        }
    }

    public static boolean kiemTraSoChinhPhuong(int n) {
        int a = (int) Math.sqrt(n);
        return a * a == n;
    }

    public static void xepLoaiHocTap(float n) {
        if (n < 5) {
            System.out.println("Loại kém");
        } else if (n >= 5 && n < 7) {
            System.out.println("Loại trung bình");
        } else if (n >= 7 && n < 8) {
            System.out.println("Loại khá");
        } else {
            System.out.println("Loại giỏi");
        }
    }

    public static void docSoNguyen(int n) {


        String[] arr1 = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] arr2 = {"", "mười", "hai mươi", "ba mươi", "bốn mươi",
                "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        int hangTram = n / 100;
        int hangChuc = (n % 100) / 10;
        int hangDonVi = n % 10;

        String ketQua = "";

        if (hangTram > 0) {
            ketQua += arr1[hangTram] + " trăm ";
        }

        if (hangChuc == 0 && hangDonVi > 0) {
            ketQua += "linh " + arr1[hangDonVi];
        } else if (hangChuc == 1) {
            ketQua += "mười " + arr1[hangDonVi];
        } else if (hangChuc > 1) {
            ketQua += arr2[hangChuc] + " ";
            if (hangDonVi > 0) {
                ketQua += arr1[hangDonVi];
            }
        } else {
            ketQua += arr1[hangDonVi];
        }

        String doc = "Số " + n + " được viết bằng chữ là \"" + ketQua + "\"";

        System.out.println(doc);
    }

    public static void tinhGiaiThua() {
        int n;
        double s = 1;
        do {
            System.out.printf("Nhập số nguyên dương n: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n < 0) {
                System.out.printf("Không hợp lệ! Vui lòng nhập lại: ");
            }
        } while (n < 0);
        int i = 1;
        while (i <= n) {
            s *= i;
            i++;
        }
        System.out.print(n + "! = " + s + "\n");
    }

    public static void nhapMang(int n, int arr[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void xoaPhanTuX(int n, int[] arr) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào phần tử cần xóa: ");
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                for (int j = i; j < n; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        System.out.print("\nMảng sau khi xóa\n ");
        xuatMang(n, arr);
    }

    public static void sapXepMang(int n, int[] arr) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void maTranDoiXung() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập cấp của ma trận: ");
            n = input.nextInt();
            if (n < 0) {
                System.out.println("Lỗi! Vui lòng nhập lại: ");
            }
        } while (n < 0);
        float[][] a = new float[n][n];
        System.out.println("Nhập giá trị ma trận vuông");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phan tu ma tran a [" + i + "][" + j + "] ");
                a[j][i] = a[i][j] = input.nextFloat();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; n > j; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");

        }
    }

    public static void MENU() {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        do {
            System.out.printf("-------MENU-------\n" +
                    "1.Giải phương trình bậc nhất\n" +
                    "2.Giải phương trình bậc hai\n" +
                    "3.Tính tiền điện\n" +
                    "4.Kiểm tra số chính phương\n" +
                    "5.Xếp loại học tập\n" +
                    "6.Đọc số nguyên\n" +
                    "7.Tính giai thừa\n" +
                    "8.Nhập mảng, xuất mảng, xóa phần tử mảng, sắp xếp mảng\n" +
                    "9.Ma trận đối xứng\n"+
                    "0.Exit\n");

            System.out.printf("Nhập lựa chọn: ");
            try {
                luachon = sc.nextInt();
                sc.nextLine();
                int[] arr = new int[100];
                switch (luachon) {
                    case 1:
                        System.out.printf("Nhập a: ");
                        double a = sc.nextFloat();
                        System.out.printf("Nhập b: ");
                        double b = sc.nextFloat();
                        phuongTrinhBacNhat(a, b);
                        break;
                    case 2:
                        System.out.printf("Nhập a: ");
                        double c = sc.nextFloat();
                        System.out.printf("Nhập b: ");
                        double d = sc.nextFloat();
                        System.out.printf("Nhập c: ");
                        double e = sc.nextFloat();
                        phuongTrinhBacHai(c, d, e);
                        break;
                    case 3:
                        System.out.printf("Nhập số điện sử dụng: ");
                        double soDien = sc.nextDouble();
                        System.out.println("Tổng tiền điện = " + tinhTienDien(soDien));
                        break;
                    case 4:
                        System.out.printf("Nhập n: ");
                        int n = sc.nextInt();
                        if (kiemTraSoChinhPhuong(n)) {
                            System.out.println("n là số chính phương");
                        } else {
                            System.out.println("n không phải là số chính phương");
                        }
                        break;
                    case 5:
                        System.out.printf("Nhập số điểm: ");
                        float diem = sc.nextFloat();
                        xepLoaiHocTap(diem);
                        break;
                    case 6:
                        System.out.printf("Nhập số nguyên 3 chữ số: ");
                        int soNguyen = sc.nextInt();
                        docSoNguyen(soNguyen);
                        break;
                    case 7:
                        tinhGiaiThua();
                        break;
                    case 8:
                        do {
                            System.out.print("Nhập số phần tử mảng: ");
                            Scanner scanner = new Scanner(System.in);
                            n = scanner.nextInt();
                            if (n < 0) {
                                System.out.print("Không hợp lệ! Vui lòng nhập lại: ");
                            }
                        } while (n < 0);
                        nhapMang(n, arr);
                        xuatMang(n, arr);
                        System.out.printf("Bạn có muốn xóa phần tử nào không\n" +
                                "Nếu có nhập 1\n" +
                                "Nếu không nhập 0\n");
                        int chon = sc.nextInt();
                        sc.nextLine();
                        if (chon == 1) {
                            xoaPhanTuX(n, arr);
                        }
                        System.out.printf("Bạn có muốn sắp xếp mảng không\n" +
                                "Nếu có nhập 1\n" +
                                "Nếu không nhập 0\n");

                        int sapXep = sc.nextInt();
                        sc.nextLine();
                        if (sapXep == 1) {
                            sapXepMang(n, arr);
                        }
                        break;
                    case 9:
                        maTranDoiXung();
                }
            } catch (InputMismatchException e) {
                System.out.println("Lỗi nhập dữ liệu! Vui long chạy lại chương trình");
            }
        } while (luachon != 0);
    }

    public static void main(String[] args) {
        MENU();
    }
}