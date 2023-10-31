package day07_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz : ");
        char girilenChar = scan.next().charAt(0);

        if (girilenChar >= 'A' && girilenChar <= 'Z') {
            System.out.println("Girilen Karakter Buyuk Harf. ");
        } else {
            System.out.println("Girilen Karakter Buyuk Harf Degildir. ");
        }

    }
}
