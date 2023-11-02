package day10_StringManipulations;

public class C03_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        // ilk harfi yazdirin.

        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(7)); // n

        // son harfi yazdirin.
        System.out.println(str.charAt(10)); // r
        System.out.println(str.charAt(11-1)); // r

        System.out.println(str.length()); // 11

        // Eger bir kod yazarken verilen input'taki
        // metin icerisindeki tum degisenleri algilamasini
        // ve yeni haline gore yazmasini istiyor isek
        // str.length() ile dinamik kod yazmaliyiz.
        // str.length() metnin uzunlugunu otomatik olarak belirler.
        System.out.println(str.charAt(str.length() - 1)); // r

        // sondan 3. harfi yazdirin.

        System.out.println(str.charAt(str.length() - 3)); // d

        // olmayan bir index numarasi veya chatAt(str.length()) yazar isek asagidaki hata gelir.
        // anlami belirtilen deger sinirlarin disinda hatasidir.
        // karakter icerisinde bosluk'lar da bir karakterdir.

        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException
        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException


    }
}
