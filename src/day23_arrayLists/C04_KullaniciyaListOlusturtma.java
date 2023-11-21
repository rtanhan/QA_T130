package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListOlusturtma {

    // Soru 2- Kullanicidan istedigi kadar isim alip,
    // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
    // bir method olusturun.

    public static void main(String[] args) {

        System.out.println(listeOlustur());

    }

    public static List<String> listeOlustur (){
        Scanner scan = new Scanner(System.in);
        List<String> girilenIsimler = new ArrayList<>();
        String girilenIsim ="";

        while (!girilenIsim.toUpperCase().equals("Q")){
            System.out.println("Lutfen listeye eklemek icin isim girin\nBitirmek icin Q'ya basin");
            girilenIsim = scan.nextLine();  // kullanicinin ne giris yaptigini bilmedigimiz icin
                                            // listeye eklemeden bir kere daha kontrole edelim.

            if (!girilenIsim.toUpperCase().equals("Q")){
                girilenIsimler.add(girilenIsim);
            }
        }
        return girilenIsimler;
    }
}
