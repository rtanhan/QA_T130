package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /*

         Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
         Isminiz : John
         Soyisminiz : Doe
         Yasiniz : 44
         Kaydiniz basariyla tamamlanmistir.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz : ");
        String soyIsim = scan.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz : ");
        int yas = scan.nextInt();


        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisim : " + soyIsim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmisitir");




    }
}
