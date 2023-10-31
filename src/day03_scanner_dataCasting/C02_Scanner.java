package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yaricap bilgisini giriniz : ");
        double yaricap = scan.nextDouble();

        double pi = 3.14;

        System.out.println("Cemberin alanı : "+ ((yaricap*yaricap)*pi));

        System.out.println("Cemberin Cecresi : "+ (2*pi*yaricap));


    }


}
