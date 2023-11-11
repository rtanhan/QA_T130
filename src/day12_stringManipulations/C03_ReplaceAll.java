package day12_stringManipulations;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // kullanicinin girdigi metinden space disindaki tum karaklerleri
        // ve sayilari silip, metni yeni haliyle yazdirin.

        // input : "J1*a34_va+12 C87an.90d654ir," output : Java Candir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String metin = scan.nextLine();

        // once tüm sayilardan kurtululyoruz.
        metin = metin.replaceAll("\\d","");
        System.out.println(metin);

        // space'i koruma altina aliyrouz bir rakam ile degistiriyoruz.
        metin = metin.replaceAll("\\s","5");
        System.out.println(metin);

        // Ozel karakerleri siliyoruz.
        metin = metin.replaceAll("\\W","");
        System.out.println(metin);

        // _ yi yok edip space'i geri getirelim.
        metin = metin.replace("_","");
        metin = metin.replace("5"," ");
        System.out.println(metin);


    }
}
