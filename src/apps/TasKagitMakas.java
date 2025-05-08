package apps;

import java.util.*;

public class TasKagitMakas {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int oyuncuPuani = 0;
        int komputerPuani = 0;
        String kompsecim = " ";
        String devamEt = "d";
        String iptalEt = "i";
        String[] arr = {"Tas", "Kagit", "Makas"};
        System.out.print("Lutfen isminizi girin: ");
        String name = scan.nextLine();

        boolean flag = true;
        boolean devam = true;
        do {
            flag = true;
            do {
                int secim = random.nextInt(3) + 1;

                System.out.println();
                System.out.println("----------------------");
                System.out.println("Lutfen tahminiz yapin: ");
                System.out.println("1-Tas" + "\n2-Kagit" + "\n3-Makas");
                System.out.print("Seciminiz: ");
                int tahmin = scan.nextInt();
                while (tahmin <= 0 || tahmin >= 4) {
                    System.out.println("Lutfen 1-3 arasinda bir rakam girin!");
                    tahmin = scan.nextInt();
                }


                switch (secim) {
                    case 1:
                        if (tahmin == 1) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[0]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[0]));
                        } else if (tahmin == 2) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[0]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[1]));
                            System.out.println("Oyuncu 1 puan kazandi");
                            oyuncuPuani += 1;
                        } else if (tahmin == 3) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[0]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[2]));
                            System.out.println("Komputer 1 puan kazandi");
                            komputerPuani += 1;
                        }
                        break;
                    case 2:
                        if (tahmin == 1) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[1]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[0]));
                            System.out.println("Komputer 1 puan kazandi");
                            komputerPuani += 1;
                        } else if (tahmin == 2) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[1]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[1]));
                        } else if (tahmin == 3) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[1]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[2]));
                            System.out.println("Oyuncu 1 puan kazandi");
                            oyuncuPuani += 1;
                        }
                        break;
                    case 3:
                        if (tahmin == 1) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[2]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[0]));
                            System.out.println("Oyuncu 1 puan kazandi");
                            oyuncuPuani += 1;
                        } else if (tahmin == 2) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[2]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[1]));
                            System.out.println("Komputer 1 puan kazandi");
                            komputerPuani += 1;
                        } else if (tahmin == 3) {
                            System.out.println("Komputerin secimi: " + (kompsecim = arr[2]));
                            System.out.println("Oyuncunun secimi: " + (kompsecim = arr[2]));

                        }
                        break;
                }

                if (oyuncuPuani == 3 || komputerPuani == 3) {
                    System.out.println("Oyun bitdi!");
                    if (oyuncuPuani == 3) {
                        System.out.println("Oyuncu kazandi");
                    } else {
                        System.out.println("Komputer kazandi");
                    }
                    flag = false;
                }


            } while (flag);

            System.out.println("Yeni oyuna baslamak istiyormusunuz?");
            System.out.println("Eger baslamak istiyorsaniz o zaman 'd', istemiyorsaniz 'i' duymesini basiniz!");
            scan.nextLine();
            String devam2 = scan.nextLine();

            if (devam2.equals(devamEt)) {
                System.out.println();
                System.out.println("Yeni oyun basliyor!");
                System.out.println();
            } else if (devam2.equals(iptalEt)) {
                System.out.println("Sonraki oyunlarda gorusuruz!");
                devam = false;
            } else {
                break;
            }


        } while (devam);


    }
}