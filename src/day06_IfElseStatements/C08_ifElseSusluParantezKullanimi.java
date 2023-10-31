package day06_IfElseStatements;

import java.util.Scanner;

public class C08_ifElseSusluParantezKullanimi {
    public static void main(String[] args) {

        // Kullanicidan 2 tam sayi alin.
        // eger sayi1, sayi2 den buyuk ise sayi1'i 1 azaltip sayi2'yi bir artirin.
        // degilse sayi1, sayi2 den buyuk degil ise sayi1'i 3 ile carpın, sayi2 yi 2 ile carpin
        // sayi1 ve sayi2 son degerlerini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tane tam sayi giriniz. : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        /*
            Eger if ve else'den sonra { } kullanmaz isek
            Java if body ve else body olarak ilk noktali virgule kadar kismi alir.
            Eger if ve else body'leri tek bir satirdan olusuyor ise suslu parantez kullanmadan da
            yazilabilir. Ama if body'sinde veya esle body'sinde bir satirdan fazla kod var ise
            MUTLAKA { } kullanmaliyiz.

            if (sayi1 > sayi2)
            sayi1--;

            else
            sayi1 = sayi1 * 3;
            sayi2 = sayi2 * 2;  -   bu satiri else satirinin disindaki yeni bir satir olarak alir
                                    ve isleme koyar sayi2'yi 2 ile carparak sonucu yazdirir.

        */

        if (sayi1 > sayi2) {
            sayi1--;
            sayi2++;

        } else {
            sayi1 = sayi1 * 3;
            sayi2 = sayi2 * 2;

        }
        System.out.println("Sayi1 : " + sayi1 + " - " + "Sayi2 : " + sayi2);


    }
}
