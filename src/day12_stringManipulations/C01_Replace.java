package day12_stringManipulations;

public class C01_Replace {

    public static void main(String[] args) {

        String str = "Hava Candir.";

        System.out.println(str.replace("H", "J")); // Java Candir

        System.out.println(str); // Hava Candir.

        str = str.replace("Hava","Java").replace(".","");

        System.out.println(str); // Java Candir

        System.out.println(str.replaceFirst("a", "A"));   // JAva Candir -- bastan baslarken gelen
                                                                            // ilk a harfini buyuk A ile degistirir.
        System.out.println(str.replace("a", "A"));        //JAvA CAndir // butun a'lari buyuk A ile degistirir

        // Boslugu yok edelim
        System.out.println(str.replace(" ", "")); // JavaCandir

        str = "Ali uzunkacaklaraltindayataruyumazoglu";
        System.out.println(str.replace("u", "U")); // Ali UzUnkacaklaraltindayatarUyUmazoglU

        System.out.println(str.replace("l", "xyz")); // Axyzi uzunkacakxyzaraxyztindayataruyumazogxyzu



    }
}

