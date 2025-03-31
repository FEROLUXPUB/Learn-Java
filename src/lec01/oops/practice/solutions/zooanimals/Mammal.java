package lec01.oops.practice.solutions.zooanimals;

public class Mammal implements Animal {

    @Override
    public void reproduce() {
        System.out.println("Mammal reproducing...");

    }

    public void liveBirth() {
        reproduce();
    }
}
