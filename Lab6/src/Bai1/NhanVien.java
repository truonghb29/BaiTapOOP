package Bai1;

public class NhanVien {
    public String ten;
    public long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }
    public String loaiNhanVien(){
        return "";
    }
    public void tinhLuong(){

    }
    public void xuatThongTin(){
        System.out.println("Ten nhan vien: "+ ten);
        System.out.printf("Loai nhan vien: "+loaiNhanVien());
    }
}
