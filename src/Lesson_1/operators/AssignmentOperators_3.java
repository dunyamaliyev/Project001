package Lesson_1.operators;

public class AssignmentOperators_3 {
    public static void main(String[] args) {

        // create variables
        int a = 4;
        int result;

        // assign value using =
        result = a;
        System.out.println("result using =: " + result);

        // assign value using +=
        // result = result + a;
        result += a;
        System.out.println("result using +=: " + result);

        // assign value using *=
        result *= a;
        System.out.println("result using *=: " + result);

    }
}
