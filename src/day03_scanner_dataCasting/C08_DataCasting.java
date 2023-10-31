package day03_scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1 / sayi2); // 6

        double sayi3 = 3;

        System.out.println(sayi1 / sayi3); // 6.66666666667

        // Kullanicidan 2 tam sayi alip 1. sayiyi 2. sayiya bolun
        // sonucu ondalikli olarak yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 adet tam sayi giriniz : ");
        int gsayi1 = scan.nextInt();
        int gsayi2 = scan.nextInt();

        System.out.println("Verilen sayilarin bolumu : " + ((double) gsayi1 / gsayi2));

        double sonuc = (double) gsayi1 / gsayi2;
        System.out.println("Verilen sayilarin bolumu : " + sonuc);


    }
}
