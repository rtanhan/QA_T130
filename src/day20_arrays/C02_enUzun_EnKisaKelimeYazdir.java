package day20_arrays;

public class C02_enUzun_EnKisaKelimeYazdir {

    public static void main(String[] args) {

        // Soru 6-  Verilen String bir array’deki
        //          en uzun ve en kisa kelimeleri yazdiran
        //          bir method olusturun.
        //          Ani uzunluktaki isimler var ise herhangi biri yazdirilabilir.

        String [] isimler = {"Sedat","Kenan","Mustafa","Gul","Ramazan","Eren","Abdurrahman","Su"};

        uzunVeKisaIsimYazdir(isimler);

    }

    public static void uzunVeKisaIsimYazdir (String[] isimler){

        String enUzunIsim = isimler[0];
        String enKisaIsim = isimler[0];

        for (int i = 1; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunIsim.length()){
                enUzunIsim = isimler[i];
            }
            // >= yaparsak en son kontrol ettigini yazdirir.
            // Esitlik eklemez isek ilk buldugunu kaydeder ve yazdirir.
            if (isimler[i].length() < enKisaIsim.length()){
                enKisaIsim = isimler[i];
            }

        }
        System.out.println("En uzun isim : "+enUzunIsim);
        System.out.println("En kisa isim : "+enKisaIsim);


    }
}
