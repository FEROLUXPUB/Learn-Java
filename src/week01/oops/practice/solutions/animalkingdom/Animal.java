package week01.oops.practice.solutions.animalkingdom;

/**
 * Create an Animal class with eat() and sleep().
 * Derive Dog and Cat classes that override eat().
 * Use super.sleep() in Dog.
 */
public class Animal {

    protected String name;
    protected int age;

    public void eat() {
        System.out.println("Animal Eating...");
    }

    public void sleep() {
        System.out.println("Animal Sleeping...");
    }
}
