package Lesson_1.operators;

public class UnaryOperators_5 {
    public static void main(String[] args) {

        //  declare variables
        int a = 12, b = 12;
        int result1, result2;

        //  original value of a
        System.out.println("Value of a : " + a);

        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);   //13

        // increment operator
        result1 = a++;
        System.out.println("After decrement: " + result1);   //13


        // original value of b
        System.out.println("Value of b : " + b);

        // decrement operator
        result2 = --b;
        System.out.println("After increment: " + result2); //11

        // decrement operator
        result2 = b--;
        System.out.println("After decrement: " + result2);  //11


//        int a = 5, b = 3; Orucun basa saldiqi metod
//        System.out.println(a++ + ++b + b++ + --a);
////        5 + 4 + 4 + 5

    }
}
