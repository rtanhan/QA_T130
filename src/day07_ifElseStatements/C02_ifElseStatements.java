package day07_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseStatements {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz : ");
        char girilenChar = scan.next().charAt(0);

        // Yontem 1

        if (Character.isLowerCase(girilenChar)) {
            System.out.println("Buyuk Harf Olarak Girilen Karakter :" + Character.toUpperCase(girilenChar));

        } else {
            System.out.println("Girilen karakter olduğu gibi :" + girilenChar);

        }

        // Yontem 2

        if (girilenChar >= 'a' && girilenChar <= 'z') {
            System.out.println("Girilen Karakter Buyuk Harf'e çevirildi : " + Character.toUpperCase(girilenChar));
        } else {
            System.out.println("Girilen Karakter Orjinal Hali " + girilenChar);
        }

        // yontem 3


        if (girilenChar >= 'a' && girilenChar <= 'z') {
            System.out.println((char) (girilenChar - 32));
        } else {
            System.out.println(girilenChar);
        }


    }
}
