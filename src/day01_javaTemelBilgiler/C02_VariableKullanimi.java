package day01_javaTemelBilgiler;

public class C02_VariableKullanimi {

    public static void main(String[] args) {

        int sayi = 20 ;
        System.out.println(sayi); //  20

        sayi = 30 ; // Java 30 degerini sayi variable'na atama yapar.
        System.out.println(sayi); // 30

        sayi = sayi + 10 ;  // Java burada sayinin degerini 10 ile toplayarak yeni degeri sayiya atar.
                            // bir onceki islemde sayiya 30 atandigi icin 30 + 10 = 40 olarak atama yapar.
        System.out.println(sayi); // 40

        sayi = 2 * sayi + 5 ; // 2 * 40 + 5 = 85 sayiya atama yapilacak yeni degerdir.
        System.out.println(sayi);

        // sayi = 3.6 ; // int olusturulmus bir variable'a farkli turde data atamasi yapilmaz.

        boolean bl = true ; // true veya false mantiksal degerleri atanabilir sadece.
        char chr = 'G' ; // char veri turune tek bir karakter atanir. tek tirnak icinde kullanilir.
        String str = "Java Candir" ; // String metinsel ifadeler icin kullanilir.
        int sy = 6 ;    // tam sayi icin int variable'i kullanilir.
                        // integer icerisinde byte, short, int, long data turleri kullanilir.
        double db = 1.2 ; // ondalikli sayi kullanmak ister isek bir degiskeni dooble kullanilir.

        // bir variable icin deklerasyon sadece bir sefer yapilir ancak atama istenildigi kadar yapila bilir.





    }
}
