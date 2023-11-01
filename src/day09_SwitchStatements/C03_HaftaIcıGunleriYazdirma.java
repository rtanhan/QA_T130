package day09_SwitchStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_HaftaIcıGunleriYazdirma {
    public static void main(String[] args) {

        /*
            Kullanicidan Gun ismini isteyin
            gunleri girilen gunun hafta ici veya hafta sonu oldugunu yazdirin

            1- Switch Statement’da switch parantezinde long, double, float ve boolean kullanilamaz.

            2- Switch Statement’da switch parantezinde yazilan degere uygun case calisir
            ve break gorunceye veya switch case bitinceye kadar calismaya devam eder.

            3- switch parantezine yazilan deger hic bir case ile uyusmaz ise
            default calisir. if else if else te bulunan else gibi.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gün adi giriniz. ");
        String gunAdi = scan.next().toUpperCase();

        switch (gunAdi) {
            case "PAZARTESI":
            case "SALI":
            case "CARSAMBA":
            case "PERSEMBE":
            case "CUMA":
                System.out.println("Haftaici");
                break;
            case "CUMARTESI":
            case "PAZAR":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gurdiginiz gun degildir. ");
        }
    }
}
