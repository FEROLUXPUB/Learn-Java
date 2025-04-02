package week01.classes.practice.solutions;

import java.util.List;

/**
 * Create a Student class with fields (name -> String, rollNumber -> String, marks -> (array of 3 subjects))
 * and methods to update/display student details.
 * Add a method to calculate averageMarks().
 */

public class Student {
    private String name;
    private String rollNumber;
    private List<Integer> marks;

    public Student(String name, String rollNumber, List<Integer> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + " Roll Number: " + rollNumber + " Marks: " + marks);
    }

    public void updateStudentInfo(String name, int mark, List<Integer> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double getAverageMark() {
        return (double) this.marks.stream().reduce(Integer::sum).orElse(0) / this.marks.size();
    }
}