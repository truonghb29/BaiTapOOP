package LAB3;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction f) {
        this.numerator = f.getNumerator();
        this.denominator = f.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public Fraction add(Fraction o) {
        int newNumerator = this.numerator * o.denominator + this.denominator * o.numerator;
        int newDenominator = this.denominator * o.denominator;
        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction sub(Fraction o){
        int newNumerator = this.numerator * o.denominator - this.denominator * o.numerator;
        int newDenominator = this.denominator * o.denominator;
        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction mul(Fraction o){
        int newNumerator = this.numerator  * o.numerator;
        int newDenominator = this.denominator * o.denominator;
        return new Fraction(newNumerator,newDenominator);
    }
    public Fraction div(Fraction o){
        int newNumerator = this.numerator  * o.denominator;
        int newDenominator = this.denominator * o.numerator;
        return new Fraction(newNumerator,newDenominator);
    }
    public void reducer() {
        int ucln = findUcln(numerator, denominator);
        numerator /= ucln;
        denominator /= ucln;
    }

  //Tim ucln
    private int findUcln(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findUcln(b, a % b);
        }
    }
}
