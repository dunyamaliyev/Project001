package Lesson_1.operators;

import java.util.Scanner;

public class IOOperators_6 {
    public static void main(String[] args) {

        // create an object of Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");

        // take input from the user
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum of numbers: " + sum);

        // closing the scanner object
        scanner.close();

    }
}
