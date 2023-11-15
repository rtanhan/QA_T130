package day19_arrays;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int [] sayilar = {3,-5,4,6,-2,9,1};
        String [] isimler = {"ali","mehmet","veli","ahmet","ramazan","mehmet","ali"};

        sayilar = C02_ArrayinElemanlariniArtirma.elemanlariArtir(sayilar,3);
        System.out.println(Arrays.toString(sayilar));

        // sayilar array'inin yeni haliyle pozitif elementlerini yazdirin.
        System.out.println("Pozitif Elementlerin toplami : "+C03_pozitifSayilariToplama.pozitifElementleriTopla(sayilar));

        // isimler array'inde mehmet ismi kac kere kullanilmistir.
        C04_kullanimAdediniBulma.elemanArama(isimler,"mehmet");

        // isimler array'inde ali ismi kac kere kullanilmis, yazdirin.
        C04_kullanimAdediniBulma.elemanArama(isimler,"ali");
    }
}
