package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_NotOrtalamasiBulma {
    public static void main(String[] args) {

        /*
        Bir ogretmenden not ortalamasi bulmak icin notlari alin.
        Ogretmen islemi bitirmek için negatif bir sayi girmelidir.
        Ogretmen negatif sayi girdiginde
        Toplam kac not girildigini, not ortalamasının kac oldugunu
        ve en yuksek notu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;
        double enYuksekNot = 0;


        while (not >=0) {
            System.out.println("Ortalama icin notlari giriniz, \nislemi bitirmek için negatif bir sayi giriniz. ");
            not = scan.nextDouble();

            if (not >= 0) {
                toplam = toplam + not;
                sayac++;

                // en yuksek not icin her girilen notu
                // o andaki en yuksek not ile karsilastiralim
                // ve girilen not en, en yuksek nottan buyukse
                // onu en yuksek not olarak atayalim.
                if (not > enYuksekNot) {
                    enYuksekNot = not;
                }
            }
        }
        System.out.println("Not girilen ogrenci sayisi : " + sayac +
                "\nGirilen notlarin ortalamasi : " + (toplam / sayac) +
                "\nGirilen En Yuksek Not : " + enYuksekNot);
    }
}
