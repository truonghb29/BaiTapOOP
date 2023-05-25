import java.util.Scanner;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String tenPhong, String diaChi, double dienTich, int soLuongDen,
                          String chuyenNganh, int sucChua, boolean coBonRua) {
        super(tenPhong, diaChi, dienTich, soLuongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public PhongThiNghiem() {
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap chuyen nghanh: ");
        chuyenNganh = sc.nextLine();
        System.out.printf("Nhap suc chua: ");
        sucChua = sc.nextInt();
        System.out.printf("Co bon rua khong (true/false): ");
        coBonRua = sc.nextBoolean();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nChuyen nghanh: "+ chuyenNganh+
                "\nSuc chua: " + sucChua+
                "\nCo bon rua khong: "+ coBonRua;
    }

    @Override
    public boolean KTDatChuan(){
        if( (getDienTich()/getSoLuongDen() <= 10) && coBonRua == true){
            return true;
        }else
            return false;
    }
}