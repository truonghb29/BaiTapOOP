package LAB3;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(4,8);
        Fraction fr2 = new Fraction(fr);
        System.out.printf(String.valueOf(fr.add(fr2)));
        fr.reducer();
        System.out.printf("sau khi reducer: "+fr.toString());
    }
}