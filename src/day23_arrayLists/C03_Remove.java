package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); // [3, 5, 2, 0]

        /*
            Remove 2 sekilde yapılabilir
            remove(index)
            remove(object)
            sayilar(0) eleman 0 mi yoksa index 0 mi?

            Javada hersey nettir
            Eger listemiz Integer'lardan olusuyor ise
            Java parametre olarak yazdigimiz sayiyi direk index kabul eder.

            Eger element olarak herhangi bir sayiyi silmek isterseniz
            once bir onject olarak o sayiyi tanimlamali
            sonra silmelisiniz.
*/
        List<Integer> silinenSayilar = new ArrayList<>();

        System.out.println(silinenSayilar.add(sayilar.remove(0))); // true
        System.out.println(silinenSayilar); // [3]
        System.out.println(sayilar); // [5, 2, 0]

        // Eleman olarak 5'i silmesini istersek
        // once bir onject olarak 5'i tanimlamaliyiz.

        Object silinecekElement = 5;

        sayilar.remove(silinecekElement);
        System.out.println(sayilar); // [2, 0]

        // eleman olarak varsa 8'i silmesini istiyorum listeyi bilmiyor isek bu sekilde
        // sildirebiliriz eger 8 listemiz yok ise false doner ve liste degismez.

        silinecekElement = 8;
        System.out.println(sayilar.remove(silinecekElement)); // false
        System.out.println(sayilar); //[2, 0]

        silinecekElement = 2;
        System.out.println(sayilar.remove(silinecekElement)); // true
        System.out.println(sayilar); // [0]


    }
}
