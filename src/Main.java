import lec01.classes.practice.solutions.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Rakshit", "1234", List.of(1,2,3,4));
        System.out.println(student.getAverageMark());
    }
}
