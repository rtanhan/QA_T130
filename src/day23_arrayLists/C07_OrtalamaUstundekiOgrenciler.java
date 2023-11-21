package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciler {
    public static void main(String[] args) {

        // bir ogretmenden ogrenci ismini ve notunu isteyin.
        // ogretmen q'ya bastiginda
        // ortalama uzerinde not alan ogrencilerin isimlerini list yazdirin.

        // ipucu : isimleri ve notlari ayri iki list olarak tutun.

        Scanner scan = new Scanner(System.in);
        List<String> isimler = new ArrayList<>();
        List<Double> notlar = new ArrayList<>();
        double girilenNot = 0;
        double notToplami = 0;
        String girilenIsim = "";

        while (!girilenIsim.toUpperCase().equals("Q")){
            System.out.println("Lutfen ogrenci ismini giriniz : ");
            girilenIsim = scan.next();

            if (!girilenIsim.toUpperCase().equals("Q")){
                isimler.add(girilenIsim);

                System.out.println("Lutfen ogrencinin notunu giriniz. ");
                girilenNot = scan.nextDouble();
                notToplami += girilenNot;
                notlar.add(girilenNot);
            }
        }
        double ortalama = notToplami / notlar.size();
        System.out.println(isimler);
        System.out.println(notlar);

        // eimizde notlar listesi ve isimler listesi var
        // ayni index'deki isim ve not ilintili
        // notlar listesindeki notlari gozden gecirin
        // ortalamanin ustunde olanlarin
        // once isimlerini, yanina notunu yazdirin.



        for (int i = 0; i < notlar.size(); i++) {

            if (notlar.get(i) > ortalama){;
                System.out.println("Ortalamnin üzerinde not alan öğrenci ismi : "+ isimler.get(i)+
                        " Öğrenci notu : "+ notlar.get(i));

            }

        }


    }
}
