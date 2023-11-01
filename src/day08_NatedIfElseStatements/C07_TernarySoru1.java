package day08_NatedIfElseStatements;

import java.util.Scanner;

public class C07_TernarySoru1 {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan bir sayi isteyin,
        sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” veya “Sayi 5’in kati degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz ");
        int sayi = scan.nextInt();

        System.out.println(sayi % 5 == 0 ? "Sayi 5'in tam kati" : "Sayi 5'in kati Degil");
    }
}
