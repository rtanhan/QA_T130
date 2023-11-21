package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        String[] harfler = {"J", "a", "v", "L", "b", "b", "a" };

        List<String> harflerharfListesi = new ArrayList<>();

        for (int i = 0; i < harfler.length; i++) {
            harflerharfListesi.add(harfler[i]);

        }
        System.out.println(harflerharfListesi); // [J, a, v, L, b, b, a]

        System.out.println(harflerharfListesi.remove("a")); // true silindi bilgisini ture / false olarak doner.

        System.out.println(harflerharfListesi); // [J, v, L, b, b, a] ilk gorunen a'yi sildi butun a'lari degil.

        System.out.println(harflerharfListesi.remove("x")); // false
        // listede "x" olmadigi icin bize false deger dondurur.
/*
         Eger paremetre olarak bir obje yazar isek gidip o obje'ye uyan ilk buldugu
         elementi siler.  Delil olarak da silip silmedigini anlamamiz icin
         true / folse boolean dondurur.
         eger remove ile index numarasi verir isek
         o index'i bulamama ihtimali olmadigindan
         gidip o index2te bulunan elemani siler
         ve delil olarak sildigi elemani bize getirir.

*/
        // harflerharfListesi.remove(20); // IndexOutOfBoundsException

        System.out.println(harflerharfListesi.remove(2)); // "L" 2. index te bulunan elementi silip
        // delil olarak sildigi elementi yazdirir.

        List<String> silinenharfler = new ArrayList<>();

        System.out.println(silinenharfler.add(harflerharfListesi.remove(1))); // true
        // 1- silinen harflere yeni bir element ekledi ve true dondurdu
        // 2- harfListesi.remove(1) harf listesinden 1.index'deki b'yi sildi ve bize getirdi
        // 3- getirdigi b elementi silinen harflere eklendi
        System.out.println(silinenharfler); // [b]
        System.out.println(harflerharfListesi); // [J, a]


        String silinenharf = harflerharfListesi.remove(0);
        silinenharfler.add(silinenharf);


    }

}
