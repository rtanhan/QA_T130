package day24_arrayLists_forEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {
    public static void main(String[] args) {

        /*

        Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();

        System.out.println("Aranacak Harfi Giriniz : ");
        String harf = scan.next().substring(0,1);

        /*
            Cumledeki her harfe iki turlu ulasabiliriz.
            1- for-loop ve substring ile
            2- siplit ile array'e cevirip, for-aech loop ile.

         */
        String [] cumleHarfArrayi = cumle.split("");

        System.out.println(Arrays.toString(cumleHarfArrayi));
        // [a, l, i,  , t, o, p, u,  , t, u, t]

        int sayac = 0;

        for (String each:cumleHarfArrayi) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Harf cumlede kullanilmamis.");
        }else{
            System.out.println("Verilen harf  "+harf+"  cumlede "+sayac+" defa kullanilmistir");
        }

        // [A, l, i,  , t, o, p, u,  , t, u, t,  , t, u, t,  , a, l, i,  , t, u, t]
        // Verilen harf  t  cumlede 7 defa kullanilmistir
    }
}
