package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {
    public static void main(String[] args) {

        /*
            Soru 6- Verilen pozitif bir tamsayiyi,
                    tam bolebilen tum pozitif tamsayilari
                    bir liste olarak bize donduren bir method olusturun.

         */
        int sayi = 30;
        List<Integer> tamBolenler = new ArrayList<>();

        // for (int i = 1; i <= sayi; i++) { // bolme ve carpma islemleri 1 den baslar.
//
        //     if (sayi % i == 0) {
        //         tamBolenler.add(i);
        //     }
//
        // }
        // System.out.println(tamBolenler);

        System.out.println(bolenlerListesi(tamBolenler, sayi));


    }
    public static List<Integer> bolenlerListesi(List<Integer> liste,int sayi){

        List<Integer> tamBolenler = liste;
        int bolunecekSayi = sayi;

        for (int i = 1; i <= sayi; i++) { // bolme ve carpma islemleri 1 den baslar.

            if (sayi % i == 0) {
                tamBolenler.add(i);
            }

        }
        // System.out.println(tamBolenler);
        return tamBolenler;
    }

}
