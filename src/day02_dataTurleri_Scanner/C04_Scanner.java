package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanicidan isimini alip buyuk harf olarak yazdirin.

        // 1. adim : scanner objesini olusturmak.

        Scanner scan = new Scanner(System.in);

        // 2. adim :    Kullanicidan istediniz bilgiyi
        //              kullaniciya bilgi olarak konsola yazdirin.
        System.out.println("Lutfen Adinizi Giriniz : ");

        // 3. adim : istediginiz bilgiye uygun bir variable olusturun.
        //           scanner obsesi ve uygun next() ile bilgiyi kullanicidan alip
        //           olusturdugunuz variable'a atayin.
        String isim = scan.nextLine();
        // next() sadece 1 kelime alabilir, nextLine() butun girilen satiri alir.

        System.out.println(isim.toUpperCase());
        // 4. adim : alinan bilgi yazdirilirken tpUpperCase() ile buyuk harfe cevirildi




    }
}
