package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_CiftSayilariSecme {
    public static void main(String[] args) {


        /*
            Verilen int bir array'den
            cift sayilari alip, ayri bir array olarak kayedin.
         */

        int[] arr = {3, 5, 9, 6, 4, 7, 6, 1, 6, 8, 3, 7, 5, 81, 2, 6, 22};

        /*  istenen elementleri bir array olarak istedigi icin
            iki sekilde yapabiliriz.

            1-  Once kac tane cift sayi oldugunu bulur
                sayiya gore bir aray olusturup
                cift sayilari olusturulan yeni array'e kopyalariz.

            2-  array'deki tum elementleri gozden gecirip
                cift olanlari bir listeye atariz.
                liste'nin uzunluna gore yeni array olusturup
                listedeki elementleri yeni array'e kopyalariz.

         */

        // array'deki tum elementleri gozden gecirip
        // cift olanlari bir listeye atariz.

        List<Integer> ciftSayilarListesi = new ArrayList<>();


        for (int each : arr
        ) {

            if (each % 2 == 0) {
                ciftSayilarListesi.add(each);
            }

        }

        int [] ciftSayilarArrayi = new int[ciftSayilarListesi.size()];
        /*
        Mantikli olan yontem for loop ile elementleri
        ciftSayilarArray'ine kopyalamaktir.

        int [] ciftSayilarArrayi = new int[ciftSayilarListesi.size()];

        for (int i = 0; i < ciftSayilarArrayi.length; i++) {
            ciftSayilarArrayi[i] = ciftSayilarListesi.get(i);

        }
        */

        // for each loop ile yapmak istersek.

        int index = 0;

        for (int each : ciftSayilarListesi
        ) {
            ciftSayilarArrayi[index] = ciftSayilarListesi.get(index);
            index++;

        }

        // System.out.println(ciftSayilarListesi);
        System.out.println(Arrays.toString(ciftSayilarArrayi));
    }
}
