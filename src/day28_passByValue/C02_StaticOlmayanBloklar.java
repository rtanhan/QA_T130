package day28_passByValue;

public class C02_StaticOlmayanBloklar {
    C02_StaticOlmayanBloklar(){
        System.out.println("Constructor calisti");
    }
    public static void main(String[] args) {
        System.out.println("Main method calisti");

        C02_StaticOlmayanBloklar obj1 = new C02_StaticOlmayanBloklar();
        C02_StaticOlmayanBloklar obj2 = new C02_StaticOlmayanBloklar();
    }


    {
        // static olmayan bloklar
        // obje olusturulacagi zaman
        // constructor'dan hemen once calisir.
        // obje olusturulmadigi taktirde calismaz.

        // bir obje olusturulmadan once
        // yapilmasi gereken on ayarlar var ise kulanilir.
        // olusturulan her bir obje icin gereken on kosullar
        // static olmayan blok icerisine yazilir
        // objeler olusturulmadan once bu on kosul calisir.
        System.out.println("Static olmayan blok calisti");

    }


}
