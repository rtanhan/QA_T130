package day08_NatedIfElseStatements;

import java.util.Scanner;

public class C02_NesteIfElseIndirimliUrunSorusu {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz : ");
        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen Urunun Normal Fiyatini Giriniz : ");
        int indirimsizFiyat = scan.nextInt();

        System.out.println("Musteri Kartınız varmı Evet / Hayir ");
        char kartVarMi = scan.next().toUpperCase().charAt(0);

        double indirimliToplamSatisFiyati = urunAdedi * indirimsizFiyat;

        int indirimOrani = 0;

        /*

            if else ile soru cozerken degisken sayisi birden fazla ise
            ic ice if else cumleleri kullanabiliriz.

            once degiskenlerden birni asil degisken olarak seciyoruz.
            yapiyi asil degiskene gore kuruyoruz.

            bu clas'ta musteri karti asil degisken olaracak.
            kart bigisine gore 3 ihtimali yazdiktan sonra
            her ihtimalin icine bu defa urun miktarina gore if else yazalim.

        */

        if (kartVarMi == 'E') {
            if (urunAdedi > 10) {
                indirimOrani = 20;
            } else if (urunAdedi > 0) {
                indirimOrani = 15;
            } else {
                System.out.println("Urun Miktari Hatali.");
            }
        } else if (kartVarMi == 'H') {
            if (urunAdedi > 10) {
                indirimOrani = 15;
            } else if (urunAdedi > 0) {
                indirimOrani = 10;
            } else {
                System.out.println("Urun Miktari Hatali");
            }

        } else {
            System.out.println("Kart Bilgisi Hatali.");
        }
        if (indirimOrani > 0) {
            System.out.println(indirimOrani + " indirimli toplam fiyat : " +
                    indirimsizFiyat * urunAdedi * (100 - indirimOrani) / 100);
        }


    }
}
