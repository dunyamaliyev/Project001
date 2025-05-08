package apps;

import java.util.*;

public class Calkluyator {
    public static void main(String[] args) {

        HesabMakinesi m1 = new HesabMakinesi();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Yapmak istediyiniz islemi secin: ");
            System.out.println("1-Quvvete yukseltme" + "\n2-2-ci dereceden koke salma" + "\n3-Ededin tersini tapmaq" + "\n4-Faktorialin tapilmasi" + "\n5-Riyazi emeller");
            System.out.print("Seciminiz: ");
            int secimIslem = scan.nextInt();
            while (secimIslem <= 0 && secimIslem >= 6) {
                System.out.println("Lutfen 1-5 arasi bir secim yapin!");
                secimIslem = scan.nextInt();
            }

            switch (secimIslem) {
                case 1:
                    System.out.print("Lutfen ededi girin: ");
                    double eded = scan.nextDouble();
                    System.out.print("Lutfen quvveti girin: ");
                    double quvvet = scan.nextDouble();
                    System.out.print("Cevab: " + m1.quvvet(eded, quvvet));
                    break;
                case 2:
                    System.out.print("Lutfen koke salmak istediyiniz ededi secin: ");
                    double eded1 = scan.nextDouble();
                    System.out.print("Cevab: " + m1.kok(eded1));
                    break;
                case 3:
                    System.out.print("Lutfen tersini tapmak istediyiniz ededi girin: ");
                    double eded2 = scan.nextDouble();
                    System.out.print("Cevab: " + m1.ededinTersi(eded2));
                    break;
                case 4:
                    System.out.print("Lutfen faktorialini tapmak istediyiniz ededi girin: ");
                    int eded3 = scan.nextInt();
                    System.out.print("Cevab: " + m1.faktorial(eded3));
                    break;
                case 5:
                    System.out.println("Lutfen riyazi emel yapmak istediyiniz 2 sayi girin: ");
                    System.out.print("Sayi 1: ");
                    double a = scan.nextDouble();
                    System.out.print("Sayi 2: ");
                    double b = scan.nextDouble();
                    System.out.println("Lutfen yapmak istediyiniz islemi secin: ");
                    System.out.println("1-Toplama" + "\n2-Cixma" + "\n3-Vurma" + "\n4-Bolme");
                    System.out.println("Seciminiz: ");
                    int secim = scan.nextInt();
                    while (secim <= 0 && secim >= 5) {
                        System.out.println("Lutfen 1-4 arasi bir secim yapin!");
                        secim = scan.nextInt();
                    }
                    switch (secim) {
                        case 1:
                            System.out.print("Cevab: " + m1.toplama(a, b));
                            break;
                        case 2:
                            System.out.print("Cevab: " + m1.cixma(a, b));
                            break;
                        case 3:
                            System.out.print("Cevab: " + m1.vurma(a, b));
                            break;
                        case 4:
                            System.out.print("Cevab: " + m1.bolme(a, b));
                            break;
                    }

                    break;

            }

        }


    }
}

class HesabMakinesi {

    public static double toplama(double a, double b) {
        return a + b;
    }

    public static double cixma(double a, double b) {
        return a - b;
    }

    public static double vurma(double a, double b) {
        return a * b;

    }

    public static double bolme(double a, double b) {
        return a / b;
    }

    public static double quvvet(double a, double b) {
        return Math.pow(a, b);
    }

    public static double kok(double a) {
        return Math.sqrt(a);
    }

    public static double ededinTersi(double a) {
        return 1 / a;
    }

    public static int faktorial(int a) {
        int hasil = 1;
        for (int i = 1; i <= a; i++) {
            hasil *= i;
        }
        return hasil;
    }


}