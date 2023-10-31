package day03_scanner_dataCasting;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {

        // EXplicit narrowing yaptigimizda data kayiplari olabilir
        // hatta bazen sayi baska alakasiz bir degere donuse bilir.
        // bu nedenle cok fazla kullanilan bir yol degildir.

        double db1 = 34.7;

        int sayi = (int) db1;

        System.out.println(sayi); // 34 ondalikli kismi siler

        int sayi1 = 23;
        byte byt = (byte) sayi1;

        System.out.println("23'un byte olarak degeri : " + byt);  // 23

        int sayi2 = 130;
        byt = (byte) sayi2;
        System.out.println("130'un byte degeri : " + byt); // -126

        int sayi3 = 260;
        byt = (byte) sayi3;
        System.out.println("260'un byte degeri : " + byt); // 4

        int sayi4 = 2600;
        byt = (byte) sayi4;
        System.out.println("2600'un byte degeri : " + byt); // 40

        int sayi5 = 2145322222;
        sayi5 = sayi5 + 50000000; // casting yok sinirlar asildigi icin deger baslangicindan tur atti.

        System.out.println("Sayi5'in degeri " + sayi5); // -2099645074
    }
}
