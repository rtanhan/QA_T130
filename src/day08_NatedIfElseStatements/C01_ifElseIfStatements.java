package day08_NatedIfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C01_ifElseIfStatements {
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

        if (kartVarMi == 'E' && urunAdedi > 10) {
            System.out.println("%20 indirimli toplam fiyat : " + indirimliToplamSatisFiyati * 80 / 100);
        } else if (kartVarMi == 'E') {
            System.out.println("%15 indirimli toplam fiyat : " + indirimliToplamSatisFiyati * 85 / 100);
        } else if (kartVarMi == 'H' && urunAdedi > 10) {
            System.out.println("%15 indirimli toplam fiyat : " + indirimliToplamSatisFiyati * 85 / 100);
        } else if (kartVarMi == 'H') {
            System.out.println("%10 indirimli toplam fiyat : " + indirimliToplamSatisFiyati * 90 / 100);
        } else {
            System.out.println("Girilen Degerlerde bir hata var.");
        }
    }
}
