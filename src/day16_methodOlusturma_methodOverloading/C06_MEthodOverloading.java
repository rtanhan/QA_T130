package day16_methodOlusturma_methodOverloading;

public class C06_MEthodOverloading {
    public static void main(String[] args) {

        /*
            Java ayni clas'da ayni isimde birden fazla method olmasina izin verir.
            Ancak signature'leri farkli olmak zorundadir.

            Signature => method ismi + parameter data turleri demektir.

            ager ayni isimde birden fazla method var ise
            1 - Java oncelikle argument ve parametler arasında %100 uyum olan var mi diye kontrol eder.
            2 - Eger %100 uyum yok ise casting ile kullanilabilecek var mi diye tumunu kontrol eder.
         */



        topla(6); // 1 method calisir.

        topla(3,5); // topla int int bununla %100 uyumlu olan 2 method calisir.

        topla(6.3,5); // topla double int bununla %100 uyumlu olan 3 method calisir.

        topla( 3.4f, 5); // toplam float int bununla %100 uyumlu olan 4 method calisir.

        topla(2.3,3.4); // topla double double bunula %100 uyumlu olan 5 method devreye girer.

        topla('a',5);     // topla char int bununla %100 uyumlu olan yoktur bu nedenle hepsini tek tek kontrol eder.
                                // casting yaparak en uygun olani otomatik olarak calistirir.
                                // char kendini int olarak gordugu icin casting olarak dahi kabul etmez Java bunu
                                // bu nedenle otomatik olarak int int olan method ile calistirir.

        topla(2.3f,3.5f); // topla float float methodu yok ancak double double methodu kapsadigi icin
                                 // otomatik olarak 5 numarali method calisir.

        topla(4,5.2); // topla int double 5 method ile int 4 degerini casting eder ve bu methodu kullanilir.
    }
    public static void topla(int sayi){ // topla int  1
        System.out.println("tek int : " + (sayi+sayi));
    }
    public static void topla (int a, int b){ // topla a int int  2
        System.out.println("int int : " + (a+b));

    }
    public static void topla (double a,int b){ //  topla double int 3
        System.out.println("double int : " + (a+b));
    }
    public static void topla (float a,int b){ // topla float int 4
        System.out.println("float int : " + (a+b));
    }
    public static void topla (double a,double b){ // topla double double 5
        System.out.println("double double : " + (a+b));
    }
}
