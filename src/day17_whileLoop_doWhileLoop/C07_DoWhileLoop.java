package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*
            While loop'ta parantez icinde kontrol degiskene
            biz loop'tan once deger atiyoruz.

            eger bu degiskene uygun olmayan bir deger atamasi yaparsak
            loop hic bir zaman calismaz.

            Java bu durumun onune gecmek icin
            yani kontrolu kullanicidan deger aldiktan sonra yapabilmemiz icin.
            do-while loop olusturulmustur.

            do while loop kullanildiginda
            loop body'sinin calismama ihtimali yoktur.
            loop body'si en az 1 kere calisir.

        */

        /*
        Bir ogretmenden not ortalamasi bulmak icin notlari alin.
        Ogretmen islemi bitirmek için negatif bir sayi girmelidir.
        Ogretmen negatif sayi girdiginde
        Toplam kac not girildigini, not ortalamasının kac oldugunu
        yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        double not =-5;
        double toplam = 0;
        int sayac = 0;

        /*
        while (not >= 0){
            System.out.println("Ortalam hesaplamak icin notlari giriniz " +
                    "\bitirmek icin negatis sayi girmelisiniz.");

            not = scan.nextDouble();

            if ( not >=0){

                toplam = toplam + not ;
                sayac ++;
            }
        }

        */

        do {

            System.out.println("Ortalam hesaplamak icin notlari giriniz " +
                    "\bitirmek icin negatis sayi girmelisiniz.");
            not = scan.nextDouble();

            if (not >= 0) {
                toplam = toplam + not;
                sayac++;
            }

        } while (not >= 0);

        System.out.println("Toplam girilen not sayisi : " + sayac +
                "\ngirilen notlarin ortalamasi : " + toplam / sayac);


    }
}
