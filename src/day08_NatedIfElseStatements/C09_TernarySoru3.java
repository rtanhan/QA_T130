package day08_NatedIfElseStatements;

import java.util.Scanner;

public class C09_TernarySoru3 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(sayi1 > sayi2 ?  sayi2 : sayi1);
    }
}
