package week01.classes.practice.solutions.employeemanagement;

/**
 * Design an Employee class with name, id, salary.
 * Add a static method compareSalary(Employee e1, Employee e2) to print who earns more.
 */

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private static void compareSalary(Employee employee1, Employee employee2) {
        if (employee1.salary > employee2.salary) {
            System.out.println("Employee "+ employee1.name +"'s salary is more than Employee "+ employee2.name +"'s salary");
        } else if (employee1.salary == employee2.salary) {
            System.out.println("Employee "+ employee1.name +"'s salary is same as Employee "+ employee2.name +"'s salary");
        } else {
            System.out.println("Employee "+ employee1.name +"'s salary is less than Employee "+ employee2.name +"'s salary");
        }
    }
}
