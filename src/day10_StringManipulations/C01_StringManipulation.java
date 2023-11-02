package day10_StringManipulations;

import java.util.Locale;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harflerde yazdirin.
        System.out.println(str.toUpperCase());

        // str'i kücük harflerle yazdirin.
        System.out.println(str.toLowerCase());

        // String medhod'lari kullanildiginda orjinal metin degismez.
        System.out.println(str);

        // eger degisikligi kalici yapmak istersek
        // ATAMA yapmaliyiz.

        // burada str'i once buyuk harfe cevirir ve atama yapar.
        // daha sonra yazdirdigimizda tum harfler buyuk olarak yazdirir.
        str = str.toUpperCase();
        System.out.println(str);

        // str'i kucuk harfe cevirin
        // ancak buyuk I harfi kucuk harfe cevirildinde
        // ingilizce i olur.

        System.out.println(str.toLowerCase());

        // eger metinde ingilizcede olmayan bir harf var ise
        // I'yi Turkce kucuk  ı'ya cevirmek istersek
        // asagidaki gibi Locale.forLanguageTag secenegi kullanilir.

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));



    }



}
