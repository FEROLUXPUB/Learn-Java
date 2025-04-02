package week01.oops.practice.solutions.shapes;

public class Rectangle implements Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * height;
    }
}
