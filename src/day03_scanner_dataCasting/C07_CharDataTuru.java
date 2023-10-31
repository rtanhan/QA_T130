package day03_scanner_dataCasting;

import java.util.Scanner;

public class C07_CharDataTuru {

    public static void main(String[] args) {

        // char ozel bir data turudur.
        // icerisine sadece tek karakter alir. 'A' '4' gibi.
        // char data turundeki variable'lar ve degerler
        // matematiksel islemlerde kullanilir ise
        // Bu durumda ASCII Table'daki decimal karsiliklari ile isleme girerler.

        System.out.println('a' + 'b'); // 97 + 98 = 195

        System.out.println('0' + '1'); // 48 + 49 = 97

        int sayi = 'c';
        System.out.println(sayi); // 99

        char chr = 101;
        System.out.println(chr); // e

        // kullanicidan bir karakter isteyin.
        // kullanicinin girdigi karakterden sonraki 3 karakteri yazdirin.
        // ornek input : l output : m, n, o

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz : ");

        char girilenChar = scan.next().charAt(0);
        System.out.println("Girilen karakter : " + girilenChar);
        System.out.println("Girilen karakter : " + (char) (girilenChar + 1));
        System.out.println("Girilen karakter : " + (char) (girilenChar + 2));
        System.out.println("Girilen karakter : " + (char) (girilenChar + 3));
    }
}
