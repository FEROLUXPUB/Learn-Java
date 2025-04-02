package week01.oops.practice.solutions.animalkingdom;

public class Dog extends Animal {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
