import week01.oops.learn.AutomaticCar;
import week01.oops.learn.Car;
import week01.oops.learn.Colors;

public class Main {

    public static void main(String[] args) {
        Car bmw = new AutomaticCar(Colors.RED, 100);
        bmw.setSpeed(-10);
        System.out.println(bmw.getColor());
    }
}
