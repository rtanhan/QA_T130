package day21_arrays_multiDimensionalArrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // verilen bir metin'de
        // istenen karakterin kac kere kullanildigini yazdirin.

        String metin = "Java da her gun yeni seyler ogreniyoruz";

        String arananKarakter = "e";
        String [] karakterler = metin.split("");

        int sayac = 0;

        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i] == arananKarakter);
            sayac++;

        }
        System.out.println("Arana karakter olan " + "'"+ arananKarakter +"'"+ " , Metin icerisinde " + sayac + " kere kulanilmistir. ");
    }
}
