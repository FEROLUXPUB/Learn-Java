package lec01.classes.practice.solutions;

/**
 * Rectangle Class
 * Create a Rectangle class with fields length and width.
 * Add methods to calculate area() and perimeter().
 * Bonus: Add a constructor to initialize fields.
 */

public class Rectangle {
    private final int length;   // final keyword is optional
    private final int width;    // final keyword is optional

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
