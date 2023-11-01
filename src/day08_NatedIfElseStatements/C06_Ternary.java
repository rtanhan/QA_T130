package day08_NatedIfElseStatements;

import java.io.Serializable;

public class C06_Ternary {
    public static void main(String[] args) {

        int input = 24;

        // iki basamakli mi ?
        // iki basamakli ise sayiyi 2 katina cikarin.
        // iki basamakli deilse "iki basamakli deil" yazdirin.
        // hem atama hem yazdirma soz konusu oldugu zaman bu islemler ternary ile yapilamaz.
        // bu nedenle klasik if else yapisi kullanilir.

        /* ternary if else in alternatifi degildi.
         sadece basit islemlerde if else'in yerine kullanilabilir.
         ternary bir sonuc uretir.
         Java tek basina ternary'nin sonucunu ne yapacagini bilemez.
         YAZDIRMA veya ATAMa yapmalisiniz.

         EGER boolean start true oldugunda elde edilen sonuc ile
         false oldugunda elde edilen sonuc farkli data turlerine sahip ise
         bir variable'a tama yapamazsiniz.
         Sadece yazdirabilirsiniz.

        */

        // String sonuc = input >= 10 && input <= 99 ? input * 2 : "iki basamakli deil";

        System.out.println(input >= 10 && input <= 99 ? input = input * 2 : "iki basamakli deil");
        System.out.println("input'un son hali " + input);
    }
}
