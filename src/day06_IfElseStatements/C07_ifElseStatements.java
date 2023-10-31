package day06_IfElseStatements;

import java.util.Scanner;

public class C07_ifElseStatements {

    // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    // ucgen eskenar ise “Eskenar ucgen” yazdirin,
    // degilse “Eskenar degil” yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3'genin kenar uzunluklarını kiriniz. ");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Ucgen eskenar degildir.");
        }
    }
}
