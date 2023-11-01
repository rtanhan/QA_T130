package day09_SwitchStatements;

import java.util.Scanner;

public class C04_ikiBasamakliSayiYazdirma {
    public static void main(String[] args) {

        /*
            Soru 2- Kullanicidan 2 basamakli bir sayi alip,
            girilen sayiyi yazi ile yazdirin

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birtam sayi giriniz. ");
        int girilensayi = scan.nextInt();

        int birlerBasamagi = girilensayi % 10;
        int onlarBasamagi = girilensayi / 10;

        switch (onlarBasamagi){
            case 1 :
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3 :
                System.out.print("otuz");
                break;
            case 4 :
                System.out.print("kirk");
                break;
            case 5 :
                System.out.print("elli");
                break;
            case 6 :
                System.out.print("altmis");
                break;
            case 7 :
                System.out.print("yetmis");
                break;
            case 8 :
                System.out.print("seksen");
                break;
            case 9 :
                System.out.print("doksan");
                break;
        }

        switch (birlerBasamagi){
            case 0 :
                break;
            case 1 :
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3 :
                System.out.print("uc");
                break;
            case 4 :
                System.out.print("dort");
                break;
            case 5 :
                System.out.print("bes");
                break;
            case 6 :
                System.out.print("alti");
                break;
            case 7 :
                System.out.print("yedi");
                break;
            case 8 :
                System.out.print("sekiz");
                break;
            case 9 :
                System.out.print("dokuz");
                break;
        }
    }
}
