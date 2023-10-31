package day07_ifElseStatements;

import java.util.Scanner;

public class C03_notYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 100 uzerinden notunu alin.
        // negatif veya 100'den buyuk deger girerse Gecersiz not
        // 85 - 100 arasi AA
        // 65 - 84 arasi BB
        // 50 - 64 arasi CC
        // 50'den kucukse DD Kaldin. Yazdirin.
        /*
            if
            else if
            else if
            .....
            else

            seklinde yazilan bir kod icin
            - sonu else ile bittiginden
              bir sonuc yazdirmama ihtimali yoktur.
            - elfe if ile butun if'ler bir birine baglandigindan
              ayni anda iki if body'sinin devreye girme ihtimalide yoktur.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu giriniz : ");
        double not = scan.nextDouble();

        if (not > 100 || not < 0) {
            System.out.println("Girdiginiz Not Gecersiz. ");
        } else if (not >= 85) {
            System.out.println("Notunuz AA geçtiniz. ");
        } else if (not >= 65) {
            System.out.println("Notunuz BB geçtiniz. ");
        } else if (not >= 60) {
            System.out.println("Notunuz CC geçtiniz. ");
        } else {
            System.out.println("Notunuz DD Kaldınız. ");
        }
    }
}

