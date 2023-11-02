package day10_StringManipulations;

public class C04_SubString {

    public static void main(String[] args) {

        String str = "java Candir";

        // String'de iki farklı yontemle subtring elde edebiliriz.
        // 1- tek parametre yazarsak

        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(0));  // Java Candir
        System.out.println(str.substring(9)); // ir

        // son 3 karakteri yazdirin. dinamik olması için yine length kullanabiliriz.
        System.out.println(str.substring(str.length()-3)); //

        // System.out.println(str.substring(20)); // StringIndexOutOfBoundsException
        System.out.println("--");
        System.out.println(str.substring(str.length())); // burada boş bir satir yani hiclik verir.
        System.out.println("--");

        // 2- iki parametre yazarsak
        // ilk parametreye esit olan index'ten baslar
        // ikinci parametreye esit olan index'e kadar yazdirir.
        // baslangic index dahil bitis dahil degildir.
        System.out.println(str.substring(1,9)); // ava Cand
        System.out.println(str.substring(0,7)); // Java Ca
        System.out.println(str.substring(1,2)); // a

        // 7. indexteki elemani yazdirin. tek bir index icin asagidaki iki yontem kullanilabilir.
        // iki yolun arasindaki fark charAt(7). yapinca yeni method kullanilamaz durumda oluyor.
        // ancak substring(7,8). diyince substring'e ait tum methodlar kulalabilir olur.
        System.out.println(str.charAt(7)); // n
        System.out.println(str.substring(7,8)); // n

        System.out.println(str.substring(2,2)); // "" yazdirir
        System.out.println("**");

        // System.out.println(str.substring(6,4)); // StringIndexOutOfBoundsException


    }
}
