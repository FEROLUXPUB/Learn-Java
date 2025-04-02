package week01.oops.learn;

/**
 * OOPS, Principles:
 * - Inheritance & Abstraction
 * - Polymorphism
 * - Encapsulation
 */
public abstract class Car implements Vehicle {
    private Colors color;
    private int speed;
    public CarType carType;

    public Car(Colors color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            throw new IllegalArgumentException("Speed must be a positive number");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}

enum CarType {
    AUTOMATIC, MANUAL
}