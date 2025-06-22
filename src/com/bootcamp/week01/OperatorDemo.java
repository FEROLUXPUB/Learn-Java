package com.bootcamp.week01;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);

        // Arithmetic operators
        System.out.println("Addition of a + b = "+ (a+b));
        System.out.println("Subtraction of a - b = "+ (a-b));
        System.out.println("Multiplication of a * b = "+ (a*b));
        System.out.println("Division of a / b = "+ ((double) a/b));

        // Relational Operators
        System.out.println("Check if a > b = "+ (a>b));
        System.out.println("Check if a < b = "+ (a<b));
        System.out.println("Check if a >= b = "+ (a>=b));
        System.out.println("Check if a <= b = "+ (a<=b));
        System.out.println("Check if a != b = "+ (a!=b));
        System.out.println("Check if a == b = "+ (a==b));

        // Ternary operator
        System.out.println("Check if a > b then print 'A is bigger' or else 'B is bigger':-> " + ((a>b) ? "A is bigger" : "B is bigger"));

    }
}
