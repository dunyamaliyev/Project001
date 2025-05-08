package Lesson_1.cycles;

public class Cycles_12 {
    public static void main(String[] args) {
        example7();
    }

    public static void example1() {
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println(i);
        }
    }

    public static void example2() {
        int i = 0;
        while (i > 5) {
            i++;
            System.out.println(i);
        }
        System.out.println(i);
    }

    public static void example3() {
        while (true) {
            System.out.println("infinity");

        }
    }

    public static void example4() {
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }

    public static void example5() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void example6() {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }

    }

    public static void example7() {
        for (int i = 1, j = 3; i < 5 & j > 0; i++, --j) {
            System.out.println("i = " + i + " j = " + j);
        }

    }


}
