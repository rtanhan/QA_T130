package day30_timeDate_Varargs;

public class C03_Varargs {
    public static void main(String[] args) {

        // verilen 2 sayinin toplamini yazdiran bir method olusturun.

        /*
            Vararg : variety of arguments demektir.
            varargs degisken sayida argument kullanmamiza imkan taniyan
            array alt yapisini kullanan bir java objesidir.

            siz argument olarak (4,5) yollarsaniz int [] sayi = {4,5} olur
                                (4,2,7)                         {4,2,7}
                                (4,5,6,7,8,9)                   {4,5,6,7,8,9}


        */

        topla(4, 5); // 9
        topla(3, 2, 7); // 12
        topla(1,2,3,4); // 10
        topla(1,2,3,4,5,6,7); // 28
        topla(4,5,6,7,8,9); // 39


    }
    public static void topla(int... sayi){

        int toplam = 0;

        for (int each : sayi ) {
            toplam = toplam + each;
        }
        System.out.println(toplam);

        // burada sayi bir tek sayi degil,
        // kac tane argument yollarsak hepsini alabilecek bir array'dir

    }
}
