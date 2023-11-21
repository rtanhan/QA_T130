package day23_arrayLists;

import day03_scanner_dataCasting.C04_DataCasting;

import java.util.ArrayList;
import java.util.List;

public class C05_IstenmeyenIsimleriSilme {
    /*
        Soru 3- Verilen String bir listede
        istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun

     */
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Meltem");
        isimler.add("Ramazan");
        isimler.add("Saido");
        isimler.add("Kaan");
        isimler.add("Kamil");
        isimler.add("Eren");

        String istenmeyenHarf = "i";

        System.out.println(istenmeyenHarfSilme(isimler, "i"));

       // int sayac = 0;

       // for (int i = 0; i < isimler.size(); i++) {
       //     if (isimler.get(i).contains(istenmeyenHarf)) {
       //         isimler.remove(isimler.get(i));
       //         i--;
       //         sayac++;
       //     }
       // }
       // System.out.println(istenmeyenHarf+" iceren "+sayac + " Adet isim silindi." +
       //         "\nListede Kalan isimler : " + isimler);


    }

    public static List<String> istenmeyenHarfSilme(List<String> gonderilenListe, String harf){


        List<String> isimler = gonderilenListe;

        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(harf)){
                isimler.remove(isimler.get(i));
                i--;  // isim silindigi izin konstole bir oncekinden baslamasi
            }

        }

        return isimler;
    }
}
