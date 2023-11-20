package day21_arrays_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_StringSiplit {
    public static void main(String[] args) {

        // split method'unda yazmis oldgumuz str.split("kelime") ayirma noktasini java metin icerisinde bulur
        // daha bu metinleri ayirma noktasi olarak imha eder veya , virgul ile degirtirerek bize
        // metnin yeni halini verir. Metnin yeni halini yazdirmak ve kaydetmek bizim elimizde aksi takdirde sadece
        // kod calisirken bir bolme olur ancak veri olarak kaydedilmez.

        String str = "Java gun gectikce guzellesiyor";

        // cumleyi "gec" metninden parcalara ayirin.
        System.out.println(Arrays.toString(str.split("gec"))); //[Java gun , tikce guzellesiyor]


        // cümleyi kelimelere ayirin.
        System.out.println(Arrays.toString(str.split(" "))); // [Java, gun, gectikce, guzellesiyor]
        // " " birakarak  harflerinden str'i parcalara ayirin.

        // "e" harfinden str'i parcala bolunuz.
        System.out.println(Arrays.toString(str.split("e")));  // [Java gun g, ctikc,  guz, ll, siyor]

        // cumleyi "" ten parcalara ayirin.
        System.out.println(Arrays.toString(str.split("")));
        // [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]



        // verilen bir arama sonucunda
        // arama sonunucunun 1000'den fazla oldugunu test edin.

        String aramaSonucu = "1-48 of over 5,000 results for java";
        String [] kelimeler = aramaSonucu.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String aramaSonucSayisiStr = kelimeler[3]; // 5,000
        aramaSonucSayisiStr = aramaSonucSayisiStr.replaceAll("\\D","");
        int aramaSonuxSayisi = Integer.parseInt(aramaSonucSayisiStr);

        if (aramaSonuxSayisi > 1000){
            System.out.println("Arama Sonuc Testi PASSED");
        }else {
            System.out.println("Arama Sonuc Testi FILED");
        }



    }
}
