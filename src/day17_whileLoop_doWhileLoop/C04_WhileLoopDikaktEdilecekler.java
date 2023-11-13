package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoopDikaktEdilecekler {
    public static void main(String[] args) {

       // 1- While parantesinde kontrol ettiğimiz degisken loop icerisinde degistirilmez ise sonsuz loop olusur.

       int sayi = 5;
       int sayac = 0;

       while (sayi <=10 ){
           sayi ++; // bunu burada kullanmadigimiz zaman sonsuz loop olur.
           sayac ++;
           System.out.println(sayac + " ");
       }

        // 2- Eger loop olusturulmadan once ihtiyac duydugumuz variable'lari biz olusturuyor isek
        // loop'un ilk defa calismasini ve kullanicidan degerler almasini
        // engellemeyecek bir deger atamaya DIKKAT etmeliyiz.

        // kullanıcıdan sayilar isteteyin verilen sayilar pozitif oldugu muddetce
        // sayilari toplayalim ve negatif sayi girildiginde toplami yazdiralim. .

       sayi = 20;
       int toplam = 0;

        Scanner scan = new Scanner(System.in);

        while (sayi >0){
            System.out.println("Lutfen toplanmak uzere pozitif tam sayilar girin. ");
            sayi = scan.nextInt();
            if(sayi >0) toplam = toplam + sayi;
        }
        System.out.println(toplam);

        // 3- eger loop parantezinde yazdigimiz degisken icin loop icerisinde
        // kullanicidan deger aliyor isek
        // aldigimiz degerin bitirme ozelligi olmayan bir deger oldugundan
        // emin olduktan sonra islemimizi yapmaliyiz.
        // 34. satirda oldugu gibi if(sayi >0) toplam = toplam + sayi;  kontrol eklememiz gerekmektedir.

    }
}
