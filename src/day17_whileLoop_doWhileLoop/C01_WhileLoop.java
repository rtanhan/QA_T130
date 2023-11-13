package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin
        baslangic ve gitis dahil olarak
        bu iki sayi arasindaki tum sayilari toplayin.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri olarak 2 tam sayi giriniz. ");
        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();

        int sayi = baslangic;
        int toplam = 0;

        // while loop ile yapalim

        while (sayi <=bitis ){
            toplam = toplam +sayi;
            sayi++;
        }
        System.out.println(baslangic + " baslangic ile "+ bitis + "Sayilarin Toplam : " +  toplam);



    }


}
