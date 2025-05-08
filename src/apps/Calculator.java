package apps;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İstifadəçidən iki ədəd daxil etməsini istəyirik
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = scanner.nextDouble();

        // İstifadəçidən operator daxil etməsini istəyirik
        System.out.print("Əməliyyatı seçin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Nəticə: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Nəticə: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Nəticə: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Nəticə: " + result);
                } else {
                    System.out.println("Sıfıra bölmək mümkün deyil!");
                }
                break;
            default:
                System.out.println("Yanlış operator daxil etdiniz!");
                break;
        }

        scanner.close();
    }
}
