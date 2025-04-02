package week01.oops.practice.solutions.shapes;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
