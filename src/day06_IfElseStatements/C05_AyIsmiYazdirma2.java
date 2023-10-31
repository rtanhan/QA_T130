package day06_IfElseStatements;

import java.util.Scanner;

public class C05_AyIsmiYazdirma2 {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // Eger girilen harf ile baslayan ay yoksa
        // " Girdiginiz harf ile baslayan ay yok " yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin : ");
        char harf = scan.next().charAt(0);

        int flag = 0;

        if (harf == 'o' || harf == 'O'){
            System.out.println("Ocak");
            flag++;
        }
        if (harf == 's' || harf == 'S'){
            System.out.println("Subat");
            flag++;
        }
        if (harf == 'm' || harf == 'M'){
            System.out.println("Mart veya Mayıs");
            flag++;
        }
        if (harf == 'n' || harf == 'N'){
            System.out.println("Nisan");
            flag++;
        }
        if (harf == 'h' || harf == 'H'){
            System.out.println("HAziran");
            flag++;
        }
        if (harf == 't' || harf == 'T'){
            System.out.println("Temmuz");
            flag++;
        }
        if (harf == 'a' || harf == 'A'){
            System.out.println("Ağustos veya Aralık");
            flag++;
        }
        if (harf == 'e' || harf == 'E'){
            System.out.println("Eylül veya Ekim");
            flag++;
        }
        if (harf == 'k' || harf == 'K'){
            System.out.println("Kasım");
            flag++;
        }
        if (flag == 0 ){
            System.out.println("Girdiginiz harf ile baslayan ay yok");
        }
    }
}
