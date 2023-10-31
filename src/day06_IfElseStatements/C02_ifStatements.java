package day06_IfElseStatements;

import java.util.Scanner;

public class C02_ifStatements {

    public static void main(String[] args) {

        //  Kullanicidan 2 sayi alin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz : ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        // ilk sayi ikinciden buyuk ise "Buyuksun Sayi1" yazdirin.
        boolean sonuc = sayi1 > sayi2;

        if (sonuc) {
            System.out.println("Buyuksun Sayi1");
        }

        // ikinci sayi 0'dan buyukse "Buyuksun Sayi2" yazdiralim.

        sonuc = sayi2 > 0;

        if (sonuc) {
            System.out.println("Buyuksun Sayi2");
        }

        // iki sayinin toplami 100'den buyukse "ikinizde buyuksunuz" yazdirin.
        sonuc = sayi1 + sayi2 > 100;

        if (sonuc) {
            System.out.println("ikinizde buyuksunuz. ");
        }

    }
}
