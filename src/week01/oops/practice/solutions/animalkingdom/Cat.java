package week01.oops.practice.solutions.animalkingdom;

public class Cat extends Animal {

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
