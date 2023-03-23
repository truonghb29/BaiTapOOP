public class HinhTron extends Hinh{
    private float r;

    public HinhTron(float r) {
        this.r = r;
    }

    @Override
    public double dienTich() {
        return this.r * Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                '}';
    }
}
