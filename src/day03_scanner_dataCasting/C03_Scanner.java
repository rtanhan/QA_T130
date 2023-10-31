package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;

        System.out.println("Sayi 1 yeni deger : " + sayi1);
        System.out.println("Sayi 2 yeni deger : " + sayi2);

        //  Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //  degerlerini degistirin(swap).

        // Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz : ");
        int sayi4 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz : ");
        int sayi5 = scan.nextInt();

        sayi4 = sayi4 + sayi5;
        sayi5 = sayi4 - sayi5;
        sayi4 = sayi4 - sayi5;


        System.out.println("Sayi 4 yeni deger : " + sayi4);
        System.out.println("Sayi 5 yeni deger : " + sayi5);

    }
}
