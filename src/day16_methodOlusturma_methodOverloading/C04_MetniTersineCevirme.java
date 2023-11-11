package day16_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C04_MetniTersineCevirme {
    public static void main(String[] args) {

        // verilen bir metni tersine cevirip bize donduren birmethod olusturun.

        // "Java ile kod yaz" cumlesini testen yazdirin.
        System.out.println(metniTerseCevir("Java ile kod yaz"));

        // kullanicidan bir kelime isteyip palindrome olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String girilenMetin = scan.nextLine();

        if(girilenMetin.equalsIgnoreCase(metniTerseCevir(girilenMetin))){
            System.out.println("Girilen Palindrome");
        }else {
            System.out.println("Girilem metin palindrome degil. ");
        }

    }

    public static String metniTerseCevir (String metin){

        String tersMetin ="";

        for (int i = metin.length() -1 ; i >=0 ; i--) {
            tersMetin += metin.substring(i,i+1);

        }
        return  tersMetin;
    }
}
