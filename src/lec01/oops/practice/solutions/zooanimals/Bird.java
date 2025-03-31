package lec01.oops.practice.solutions.zooanimals;

public class Bird implements Animal {

    @Override
    public void reproduce() {
        System.out.println("Bird reproduces using eggs...");
    }

    public void layEggs() {
        reproduce();
    }
}
