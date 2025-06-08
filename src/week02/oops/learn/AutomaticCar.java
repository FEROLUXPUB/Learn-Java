package week02.oops.learn;

public class AutomaticCar extends Car {

    public String tempVar;

    public AutomaticCar(Colors color, int speed) {
        super(color, speed);
        super.carType = CarType.AUTOMATIC;
    }

    @Override
    public void drive() {
        System.out.println("Automatic Car is driving");
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
