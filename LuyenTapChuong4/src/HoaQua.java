public class HoaQua {
    private double giaBan,soLuong;
    private String nguonGoc;

    public HoaQua() {
    }

    public HoaQua(double giaBan, double soLuong, String nguonGoc) {
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nguonGoc = nguonGoc;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public double tinhTien(){
        return this.giaBan*this.soLuong;
    }

}
