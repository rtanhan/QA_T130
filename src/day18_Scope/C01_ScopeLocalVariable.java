package day18_Scope;

public class C01_Scope {
    public static void main(String[] args) {

        // Kural 1 -  Bir merhod icerisinde olusturulan variable'lara
        //            local variable denir.
        //            local variable'lar sadece olusturulduklari method'da kullanilabilir
        //            diger method'larda KULLANILAMAZ.


        String str = "Java Candir";
        // System.out.println(sayi);

        int a;
        boolean bl;
        char c;

        // System.out.println(a); deger atanmadigi icin yazdirilamaz.

        // a++ deger atanmamis bir variable'a artirma yaplamaz.

        bl = true;
        c= 'a';

        // Kural 2 - Local variable'lar deger atanmadan olusturulabilir
        //           AMMA deger atanmadan kulanilamazlar.

        for (int i = 0; i < 10; i++) {
            System.out.println(i); // 0123456789
            String s = "Java";
        }

        System.out.println(i); // Cannot resolve symbol 'i'
        System.out.println(s); // Cannot resolve symbol 's'

        // Kural 3 - Her ne kadar bir method'un icinde olsa da
        //           Loop'larda ayri bir local alandir.
        //           Loop icerisinde olusturulan variable'lar
        //           Loop disinda kullanilamaz. 
    }

    public static void method1(){
        // System.out.println(str);

        int sayi = 10;
    }

    /*
        Scope temelde 2'ye ayrilir
            1- Local variable'lar
                A - scope'lari icinde olusturulduklari kod blogudur
                    bir method'da olusturulan variable, baska method'dan KULLANILAMAZ
                B - Loop Scope'u
                    bir loop icerisinde olusturulan variable
                    sadece o loop icerisinde kullanilabilir
                    olusturuldugu method'da loop'un disinda da KULLANILAMAZ
               Not: local variable'lar deger verilmeden olusturulabilir
                    ama deger atanmadan KULLANILAMAZ
           2- Class Level Variable'lar
              Class level variable'lar method'larin ve kod bloklarinin disinda olusturulur
              ve scope'lari TUM CLASS'dir.

              Class level variable'larin scope'u tum class olsa da
              static keyword de variable'larin kullanimina etki eder

              hastane ismi, hastane adresi, bashekim adi gibi variable'lar
              herkes icin ortak olmalidir.
              bu tur variable'lar static olarak isaretlenir

              personel ismi, personel adresi, personel telefonu gibi variable'lar ise
              tum personel icin tanimli olmakla birlikte
              bu variable'lardaki degisim herkesi ETKILEMEZ
              sadece o personeli etkiler
              bu tur varianble'lari ise static yapmayiz
              static olmayan class level'daki variable'lara INSTANCE variable'lar denir

                C - class level static variable'lar
                    bu variable'lar static klubune uye olduklari icin
                    her yere gidebilirler
                    her method'dan kullanilabilirler
                D - class level instance variable'lar
                    variable static olmayinca ustunlugu olmaz
                    bu durumda secici olan method olur

                    static method'lar instance variable'larin girmesine izin vermez
                    ama static olmayan method'lar,
                    static olmayan(instance) variable'lari kabul eder


     */
}
