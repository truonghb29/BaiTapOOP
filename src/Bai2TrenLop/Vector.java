package Bai2TrenLop;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector add(Vector v) {
        int newX = this.x + v.x;
        int newY = this.y + v.y;
        int newZ = this.z + v.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector sub(Vector v) {
        int newX = v.x - this.x;
        int newY = v.y - this.y;
        int newZ = v.z - this.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector mulK(int k) {
        this.x = k * this.x;
        this.y = k * this.y;
        this.z = k * this.z;
        return new Vector(x, y, z);
    }

    public int tichVoHuong(Vector v) {
        return (v.x * this.x) + (v.y * this.y) + (v.z * this.z);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
