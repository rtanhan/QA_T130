package day24_arrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C03_ArrayListHalineDonusturme {

    public static void main(String[] args) {

        int [] sayilarArray = {1,2,3,4,6,7,4,3,5};

        /*
        Bir array'i list haline getirmek icin
        en guvenilir yontem
        bir loop ile tum elementleri list'e kopyalamaktir.

        Aslinda daha kisa bir yol vardir
        amöa iki buyuk yan etkisi oldugundan
        bunlara dikkat etmek gerekir.

         */

        List<Integer> sayilarListesi = Arrays.asList(sayilarArray);
        System.out.println(sayilarListesi);


    }
}
