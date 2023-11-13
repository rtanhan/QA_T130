package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C08_KareKokBulma {
    public static void main(String[] args) {

        // Soru 3-  Kullanicidan bir pozitif sayi isteyin,
        //          sayının tam kare olup olmadığını bulunuz,
        //          tamkare ise true değilse false yazdırınız.
        //          Ornek : input : 16, output: 4

        Scanner scan = new Scanner(System.in);
        System.out.println("Karekok bulmak icin pozitif bir tamsayi girin.");
        int sayi = scan.nextInt();

        int karekokKontrol = 1;
        int flag = 10;

        // for loop ile yapalim.

        for (int i = 1; i * i <= sayi; i++) {
            if (i * i == sayi) {
                // System.out.println("Girilen sayi  "+i+"'nin tam karesidir.");
                flag++;
                break;
            }

        }
        if (flag == 10) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        // do ile yapalim.

        karekokKontrol = 1;
        flag = 10;

        do {
            if (karekokKontrol * karekokKontrol == sayi) {
                flag++;
                break;
            }
            karekokKontrol++;

        } while (karekokKontrol * karekokKontrol <= sayi);

        if (flag == 10) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
