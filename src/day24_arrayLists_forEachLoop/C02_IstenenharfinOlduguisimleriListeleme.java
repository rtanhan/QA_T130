package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenharfinOlduguisimleriListeleme {
    public static void main(String[] args) {
        /*
        Verilen bir String array'de
        istenen harfi iceren isimleri
        bir Liste olarak yazdirin

         */

        String[] isimler ={"derya", "ismail","sedat", "tugba","murat","sahil"};

        String istenilenhatf = "e";

        List<String> uyfunIsimlerListei = new ArrayList<>();

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].contains(istenilenhatf)){
                uyfunIsimlerListei.add(isimler[i]);
            }

        }
        System.out.println("İstenen harfi iceren isimler : " +uyfunIsimlerListei);


    }
}
