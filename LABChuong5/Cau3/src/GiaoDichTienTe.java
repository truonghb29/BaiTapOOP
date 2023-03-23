public class GiaoDichTienTe extends GiaoDich{
    private double tiGia;
    private String loaiTien;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, double donGia, double soLuong, double tiGia, String loaiTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    @Override
    public double thanhTien() {
        if(this.loaiTien == "Viet"){
            return this.getSoLuong()*this.getDonGia();
        }else{
            return this.getSoLuong()*this.getDonGia()*this.tiGia;
        }
    }
}
