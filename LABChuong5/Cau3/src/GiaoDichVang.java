public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, double donGia, double soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public double thanhTien() {
        return super.thanhTien();
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + getMaGiaoDich() + '\'' +
                ", ngayGiaoDich='" + getNgayGiaoDich() + '\'' +
                ", donGia=" + getDonGia() +
                ", soLuong=" + getSoLuong() +
                ",LoaiVang="+loaiVang+
                ",Thanhtien="+ thanhTien()+
                '}';
    }
}
