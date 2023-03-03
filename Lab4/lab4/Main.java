public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2,"red");
        Cylinder c1 = new Cylinder(2,"red",4);
        System.out.println("Area = "+ c.getArea());
        System.out.println("Volume = "+ c1.getVolume());
    }
}