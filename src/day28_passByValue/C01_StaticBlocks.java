package day28_passByValue;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor Calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");


        C01_StaticBlocks onj = new C01_StaticBlocks();

    }

    static {
        // bu yapiya static blok denir.
        // static blok'lar herseyden hatta main method'dan bile once calisir.
        // Eger bir clas icin main method calismadan once
        // yapilmasi gereken on ayarlar var ise
        // static blok kullanilarak yapilir.

        // bir class'da birden fazla static blok olabilir
        // eger birden fazla static blok var ise
        // kendi iclerinde once yukardaki calisir.

        System.out.println("Static blok calisti");
    }

    static {
        System.out.println("2. static blok calisti");
    }

    public static void method1 (){
        System.out.println("Method1 calisti");
    }
}
