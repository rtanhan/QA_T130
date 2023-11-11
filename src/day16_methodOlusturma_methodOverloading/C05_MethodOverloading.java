package day16_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayip, sonucu yazdiran bir method olusturun.

        toplaYazdir(15,16); // iki int'in toplami : 31
        toplaYazdir(7.4,6); // double ve  int'in toplami : 13.4
        toplaYazdir("ali",5); // String ve  int'in toplami : ali5
        // toplaYazdir(5,7.6); // Cannot resolve method 'toplaYazdir(int, double)'
        toplaYazdir('4','a'); // iki int'in toplami : 149 ascii den int karsili olan degerleri alarak toplar.

        // toplaYazdir (char,char) yok ama
        // char ascii sayesinde int'a donusebildigi icin
        // toplaYazdir(int,int) method'u kullanilabilir.

        toplaYazdir(3.5f,5); // double ve  int'in toplami : 8.5
        // float double degildir ama outo widening ile
        // double bir degiskene float bir deger atanabilir.


    }



    public static void toplaYazdir (int sayi1, int sayi2){
        System.out.println("iki int'in toplami : " + (sayi1+sayi2));
    }

    // 'toplaYazdir(int, int)' is already defined in
    // 'day16_methodOlusturma_methodOverloading.C05_MethodOverloading'
    // java parametlerin adina degil data turune bakiyor.
    // yukaridaki method toplayazir(int, int) varken yenisini olusturamazsiniz.

    /*
        Java'da methos ismi ve parametrelerin data turleri birlikte duınusuldugunde
        ortaya cikan metne METHOD SIGNATURE denir.

        Java method'lardaki parametre isimlerine degil
        method signature'ina bakar.
        ayni method signature'ina sahip birden fazla method olusturmaniza izin vermez.

    */
    public static void toplaYazdir (double a, int b){
        System.out.println("double ve  int'in toplami : " + (a+b));
    }
    public static void toplaYazdir (String a, int b){
        System.out.println("String ve  int'in toplami : " + (a+b));
    }
}
