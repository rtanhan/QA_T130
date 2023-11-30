package day29_immutableClasses;

import java.time.LocalTime;

public class C07_LocalTime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();

        System.out.println(saat); // 23:15:27.179250700

        LocalTime baslangic = LocalTime.now();
        long nanoBaslangic = baslangic.getNano();

        int toplam = 0;

        for (int i = 1; i <=1000000 ; i++) {

            toplam+= i % 10;

        }
        System.out.println(toplam);

        LocalTime bitis = LocalTime.now();
        long nanoBitis = bitis.getNano();

        System.out.println("islem suresi = " + (nanoBitis-nanoBaslangic));
    }
}
