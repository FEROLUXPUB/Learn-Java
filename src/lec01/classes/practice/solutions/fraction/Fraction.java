package lec01.classes.practice.solutions.fraction;

/**
 * Create a Fraction class with numerator and denominator.
 * Add methods to:
 * Simplify the fraction (e.g., 2/4 → 1/2).
 * Add two fractions (a/b + c/d = (ad + bc)/bd).
 */

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplifyFraction();
    }

    public void simplifyFraction() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    public int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
