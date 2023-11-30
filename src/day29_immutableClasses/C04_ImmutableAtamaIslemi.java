package day29_immutableClasses;

public class C04_ImmutableAtamaIslemi {

    public static void main(String[] args) {

        String isim = "Sedat";

        isim = isim.concat(" Yaman");

        System.out.println(isim);

        // 15'inci satirdan (str) itibaren str sout'a kadar Java kactane obje olusturur?
        // Cevap : 101
        String str = "a";

        for (int i = 1; i <= 100; i++) {
            str += "a";

        }
        System.out.println(str);
    }
}
