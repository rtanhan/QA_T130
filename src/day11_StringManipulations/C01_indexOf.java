package day11_StringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Java cok guzel bir proglama dili";

        System.out.println(str.contains("a"));                        // true - a varmi yok mu
        System.out.println(str.indexOf("a"));                         // 1 - a nin index bilgisini verir. JAva ilk gelen index'i yazar.
        System.out.println(str.indexOf('c'));                         // 5 - str veya char olarak index of verilebilir.
        System.out.println(str.charAt(5));                            // c - 5. indexte olan karakteri verir.
        System.out.println(str.indexOf("a "));                        // 3 "a " - ikisini birden arar ve ikinin oldugu ilk index baslangicini verir.
        System.out.println(str.indexOf("guzel"));                     // 9 - guzel yazan ilk kelimenin baslangic harfi index baslangicidir.
        System.out.println(str.indexOf(" "));                         // 4 - ilk " " in index'ini verir.
        System.out.println(str.indexOf(" ", 10));       // 15 - 10'uncu index numarasindan sonraki ilk index'i verir.
        // saymaya baslayacahi alani biz belirtiyoruz. burada

        // ikinci " " in index'i
        System.out.println(str.indexOf(" ", 4) + 1);    // ilk bosluktan sonraki boslugu bulur.

        // ikinci i'nin index'ini yazdirin.
        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); // 29 ilk iden sonraki gelecek ilk i nin index'ini verir.

        // ikinci a'nin index'ini yazdirin.
        System.out.println(str.indexOf("a", str.indexOf("a") + 1)); // 3 ikinci a'nin index bilgisi.

        // olmayan bir harfin index bilgisini istersek java bize bunun olmadigini int bir kod olarak doner
        // bu -1 gibi negatif bir deger olarak doner. standart -1 verir.
        System.out.println(str.indexOf("x"));                         // -1 olmayan bir harfin index bilgisi olarak doner.

        System.out.println(str.indexOf("phyton"));                    // -1 olmayan deger istendiginde verir.

        // ikinci c olup olmadigini yazdirin.
        // bu islem icin asagidaki gibi bir if else dongusu kullanilmasi en mantikli cozum olmaktadir.


        int ilkCindex = str.indexOf("c");

        if (ilkCindex == -1) {
            System.out.println("Verilen metince C yok");
        } else if (str.indexOf("c", ilkCindex + 1) == -1) {
            System.out.println("2. C yok");
        } else {
            System.out.println("2. C var.");
        }
    }
}
