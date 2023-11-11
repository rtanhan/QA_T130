package day16_methodOlusturma_methodOverloading;

public class C03_StringMethodlari {
    public static void main(String[] args) {

        String str = "Java cok kolay, yeter ki anlayalim";

        str.toLowerCase();  // metni kucuk harfe cevirir
                            // ama yazdirmadigimiz veya atama yapmadigimiz icin
                            // bosa calismis olur

        C02_returnTypeileMethodOlusturma.isimiIstenenFormataCevir("Ramazan","Tanhan");

        // bu iki yapi arasinda bir fark bulunmamaktadir.
        // her ikiside string olarak sonucu dondurur.
        // atama veya yazdirma olmadigi icin herhang bir sey goremeyiz.
        // islem sonucu döndüren method'lari ya uygun bir variable'a atamaliyiz
        // veya direk olarak yazdirmaliyiz.
        // aksi durumda method calisir, bize sonucu döndürür (getirir)
        // ama kullanmadigimiz icin havaya ucar.

        // Bu method void oldugundan sadece cagirabilirim.
        C01_voidMethodOlusturma.kisiBilgileriYazdir("Ayse","Hanci","1234569878965412");

        C02_returnTypeileMethodOlusturma.isimiIstenenFormataCevir("Kemal","Yanci");
        // bu method bana method'da donustrulen halini döndürür (getiri)
        // K**** Y****
        // ama yazdirmaz isek konsolda birsey gormeyiz.

        String donusmusIsim = C02_returnTypeileMethodOlusturma.isimiIstenenFormataCevir("Kemal","Yanci");
        System.out.println(donusmusIsim); // K**** Y****
        // bu sekilde atama yaptiktan sonra artik bu String deger uzerinde istedigimiz her islemi yapabilriz.
    }
}
