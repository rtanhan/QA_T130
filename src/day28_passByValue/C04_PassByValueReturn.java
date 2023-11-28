package day28_passByValue;

public class C04_PassByValueReturn {
    public static void main(String[] args) {

        /*
            Method'lar arasi geciste
            variable'in kendisi degil degeri yollanir.

            her method'un icindeki local variable
            o method'da gecerli oldugundan
            main method'da atama var ise, main method'daki fiyat cariable'i kalici olarak degisir.
            diger method'da atama var ise o method'daki variable'in degeri degisir.

            method her cagirildigi zaman
            sanki ilk defa calisiyor gibi sifirdan baslayarak yeniden calisir.

         */


        // verilen bir fiyat icin
        // %10 indirimli fiyati hesaplayip
        // indirimli fiyati dondoren bir method olusturun.

        double fiyat = 200;

        System.out.println(fiyat); // 200

        // indirimli fiyati yazdirmak istersem

        System.out.println(yuz10IndirimliFiyatHesapla(fiyat)); // 180

        System.out.println(fiyat); // 200

        // % 10 indirimli fiyati kalici hale getiririn.

        fiyat = yuz10IndirimliFiyatHesapla(fiyat);

        System.out.println(fiyat); // 180
    }

    public static double yuz10IndirimliFiyatHesapla (double fiyat){

        fiyat = fiyat * 90 / 100;

        return fiyat;

    }
}
