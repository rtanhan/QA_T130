package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_KullanicidanAlinanSayilarinToplama {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500'u gecerse
        // "Bu kadar sayi yeter, ... adet sayi girdiniz ve toplami ... oldu" yazdirin
        // ve islemi bitirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz. ");
        int girilenSayi = scan.nextInt();

        int toplam = 0 ;
        int sayi = 0;
        int sayac = 0;
        while (toplam <= 500){
            System.out.println("Lutfen toplanmak uzere tamsayi giriniz. ");
            sayi = scan.nextInt();
            sayac++;
            toplam = toplam + sayi ;
        }

        System.out.println("Bu kadar yasi yeter, "+sayac+ "Adet sayi girdiniz "+toplam);
    }
}
