public class HinhChuNhat extends Hinh{
    private float cd,cr;

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }
    public double dienTich(){
        return this.cd * this.cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "cd=" + cd +
                ", cr=" + cr +
                '}';
    }
}
