package day07_ifElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        // kullanicidan bir pozitif tam sayi alin
        // 3 ile bolunebiliyorsa 3'un kati
        // 5'ile bolunebiliyorsa 5'in kati
        // hem 3 hemde 5 ile bolunebiliyorsa Super Sayi

        /*
            - Eger sartlar birbiri ile ilgili ise
            en once en secici olani yazmaliyiz.

            - Eger ifade else ile bitmez ise
            if else statements tum degerleri kapsamiyor demektir.
            yani bazi degerleri girdigimizde
            kod calisir ama hic bir sonuc uretmez.

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0) {
            System.out.println("super sayi");

        } else if (girilenSayi % 3 == 0) {
            System.out.println("3'un kati ");

        } else if (girilenSayi % 5 == 0) {
            System.out.println("5'in kati");

        }
    }
}
