package Lesson_1.ifElse;

import java.util.Scanner;

public class IfStatement_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // checks if number  is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        //if both condition is false
        else {
            System.out.println("The number is 0.");
        }

        // closing the scanner object
        scanner.close();


    }
}
