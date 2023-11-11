package day12_stringManipulations;

public class C02_ReplacaAll {
    public static void main(String[] args) {
        String str = "J1a34va12 C87an90d65ir";

        // Metinden tum sayilari temizleyip
        // metni kaydedin.

        // ReplacaAll tek tek harflerii, rakamlari degil
        // tum harfleri, yada tum rakamlari diyebilecegimiz durumlarda kullanilir.

        // ornegin bu soruca "tum sayilari yok etmemiz" lazim.

        str = str.replaceAll("\\d","");

        System.out.println(str); // Java Candir

    }
}
