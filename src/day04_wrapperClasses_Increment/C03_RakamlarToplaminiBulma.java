package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir tam sayi alip
        // sayinin rakamlar toplamini yazdirin.

        // diyelim ki kullanici 375 sayisini girdi
        // bize birler basamagini ve rakamlar toplamini kaydedecegimiz
        // 2 variable lazim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz : ");
        int girilenSayi = scan.nextInt();

        // diyelimki kullanici 375 verdi

        int rakamlarToplami = 0;
        int birlerBasamagi = 0;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // 5'i rakamlar toplamina ekledik 5'ten kurtulalim.
        girilenSayi = girilenSayi / 10;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // 7'yi rakamlar toplamına ekledik 7'den kurtulalim.
        girilenSayi = girilenSayi / 10;


        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        // 3u rakamlar toplamina ekledik 3'en kurtulalim.
        girilenSayi = girilenSayi / 10;


        System.out.println("Girilen sayi rakamlar toplamı : " + rakamlarToplami);

    }
}
