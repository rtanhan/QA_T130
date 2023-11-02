package day10_StringManipulations;

import java.util.Scanner;

public class C07_emailKontrol {

    public static void main(String[] args) {

        // Kullanicidan e-mail adresini isteyin.
        // eger e-mail adresi @ isareti icermiyor ise "Yanlis giris"
        // eger @gmail.com icermiyor ise "Email gmail olmali"
        // email @gmail.com ile bitmiyor ise "Gecersiz mail"
        // email bosluk iceriyor ise "Yazim Hatasi" yazdirin.
        // eger hata yoksa "mailiniz kaydedildi" yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz : ");
        String email = scan.nextLine();

        if (!email.contains("@")){
            System.out.println("Yanlis Giris");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("E-mail gmail olmali");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Gecersiz mail");
        } else if (email.contains(" ")) {
            System.out.println("Yazim Hatasi");
        }else {
            System.out.println("E-mail'iniz kaydedildi. ");
        }
    }
}
