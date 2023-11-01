package day09_SwitchStatements;

import java.util.Scanner;

public class C02_SwitchCaseStatements {
    public static void main(String[] args) {

                /*
            Soru 4- Kullanicidan ISTQB kisaltmasindan harflerden
            anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
            I : International S : Software T : Testing Q : Qualifications B: Board

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlanini ogrenmek istediginiz harfi giriniz :");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualification");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Girdiginiz harf kisalatmalar icerisinde bulunmuyor.");

        }

    }
}
