package Lesson_1.operators;

import java.util.Scanner;
public class TernaryOperators_11 {
    public static void main(String[] args) {


        // create an object of Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");

        // take input from the user
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int max = a > b ? a : b;
        System.out.println("Max of numbers: " + max);

        // closing the scanner object
        scanner.close();
    }
}
