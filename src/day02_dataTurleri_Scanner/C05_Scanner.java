package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayiInt = scan.nextInt();

        System.out.println("Lutfen ondalik'li bir sayi girin : ");
        double sayiDouble = scan.nextDouble();

        System.out.println("Girilen tam sayi ile doouble sayinin toplamı sonucu : " + (sayiInt + sayiDouble) + "'dir");
        System.out.println("Girilen tam sayi ile doouble sayinin carpim sonucu : " + (sayiInt * sayiDouble) + "'dir");


    }
}
