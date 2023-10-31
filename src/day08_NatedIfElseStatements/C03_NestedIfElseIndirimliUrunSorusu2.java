package day08_NatedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElseIndirimliUrunSorusu2 {
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
            Bu soruda ana degiskenimiz urun mikari ikinci degisken kart bilgisi olarak
            soruyu cozuyoruz.

        */

        if (urunAdedi > 10){ // Urun miktari 10'dan fazla olanlar.
            if (kartVarMi == 'E'){
                indirimOrani = 20;
            }else if (kartVarMi == 'H') {
                indirimOrani = 15;
            }else {
                System.out.println("kart bilgisi hatali");
            }

        } else if (urunAdedi > 0) { // Urun miktari 1 ile 10 sinirlar dahil arasında olanlar.
            if (kartVarMi == 'E'){
                indirimOrani = 15;
            }else if (kartVarMi == 'H'){
                indirimOrani = 10;
            }else{
                System.out.println("kart bilgisi hatali");
            }

        }else {// urun miktarı 0 veya negatif olanlar.
            System.out.println("Urun Miktari Hatali");
        }

        if (indirimOrani > 0) {
            System.out.println(indirimOrani + " indirimli toplam fiyat : " +
                    indirimsizFiyat * urunAdedi * (100 - indirimOrani) / 100);

    }
}
