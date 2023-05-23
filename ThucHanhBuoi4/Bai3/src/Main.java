import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<DiemHocVien> list;
        list = new ArrayList<>();
        list.add(new DiemHocVien("Nguyễn Văn A", 2000, 8.5, 7.0, 6.5, 9.0, 8.0));
        list.add(new DiemHocVien("Trần Thị B", 1999, 6.0, 7.5, 8.0, 7.0, 6.5));
        list.add(new DiemHocVien("Lê Văn C", 2001, 7.0, 4.0, 7.0, 7.0, 7.0));

        int soLuongLuanVan = 0;
        int soLuongTotNghiep = 0;
        int soLuongThiLai = 0;
        ArrayList<String> monThiLai = new ArrayList<>();

        for (DiemHocVien hocVien : list) {
            double diemTrungBinh = hocVien.tinhDTB();
            boolean coMonDuoi5 = false;

            if (diemTrungBinh >= 7) {
                if (hocVien.getDiemMon1() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon2() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon3() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon4() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon5() < 5) {
                    coMonDuoi5 = true;
                }
                if (coMonDuoi5 == false) {
                    soLuongLuanVan++;
                }
            }
            if (diemTrungBinh < 7) {
                if (hocVien.getDiemMon1() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon2() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon3() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon4() < 5) {
                    coMonDuoi5 = true;
                }
                if (hocVien.getDiemMon5() < 5) {
                    coMonDuoi5 = true;
                }
                if (coMonDuoi5 == false) {
                    soLuongTotNghiep++;
                }
            }
            if (hocVien.getDiemMon1() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 1");
            }
            if (hocVien.getDiemMon2() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 2");
            }
            if (hocVien.getDiemMon3() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 3");
            }
            if (hocVien.getDiemMon4() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 4");
            }
            if (hocVien.getDiemMon5() < 5) {
                coMonDuoi5 = true;
                monThiLai.add("Mon 5");
            }
            if(coMonDuoi5){
                soLuongThiLai++;
            }
        }

        System.out.println("Số lượng học viên đạt làm luận văn tốt nghiệp: " + soLuongLuanVan);
        System.out.println("Số lượng học viên đạt tốt nghiệp: " + soLuongTotNghiep);
        System.out.println("Số lượng học viên phải thi lại: " + soLuongThiLai);
        System.out.println("Các môn học cần thi lại: " + monThiLai);
    }
}
