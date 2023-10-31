package day08_NatedIfElseStatements;

import java.util.Scanner;

public class C04_NastedIfElseEmeklilik {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek, K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        // Ana degisken cinsiyet olarak kod yazilacaktır.

        if (cinsiyet == 'E'){ // Erkek olanlar icin.
            if (yas > 85 || yas < 15){
                System.out.println("Bu yaslar icin emeklilik imkani yok. ");
            }else if (yas >= 65){
                System.out.println("Erkek Emekli olabilir.");
            }else{
                System.out.println("Erkek Emekli olmak icin " + (65-yas) + " sene daha calismaniz gerekiyor. ");
            }

        } else if (cinsiyet == 'K') { // kadinlar icin olan kisim.
            if (yas > 85 || yas < 15){
                System.out.println("Bu yaslar icin emeklilik imkani yok. ");
            }else if (yas >= 60){
                System.out.println("Kadin Emekli olabilir.");
            }else{
                System.out.println("Kadin Emekli olmak icin " + (60-yas) + " sene daha calismaniz gerekiyor. ");
            }

        }else {
            System.out.println("Cinsiyet icin E veya K secmelisiniz. ");
        }
    }
}
