package day10_StringManipulations;

public class C05_contains {

    public static void main(String[] args) {

        String str = "Java Candir";

        // Adet gozetmeksizin bir String'te aranan bir metnin
        // var olup olmadigina bakar. Metin var ise true yoksa false dondurur.

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains("b")); // false
        System.out.println(str.contains("java")); // false
        System.out.println(str.contains("Java")); // true
        System.out.println(str.contains("a C")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains("")); // true hiclik her yerde bulunur.






    }
}
