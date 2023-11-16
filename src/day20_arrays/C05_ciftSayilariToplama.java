package day20_arrays;

public class C05_ciftSayilariToplama {
    public static void main(String[] args) {

        // verilen int bir array'deki cift sayilarin toplamini yazdirin.

        int [] sayilar = {1,2,3,4,5,6,7,8,9};
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 == 0){
                toplam = toplam + sayilar[i];
            }

        }
        System.out.println("Cift sayilarin toplami : "+ toplam);

        ciftSayilariTopla(sayilar);
    }

    public static void ciftSayilariTopla (int [] arr){
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0){
                toplam = toplam + arr[i];
            }
        }
        System.out.println("Cift sayilarin toplami : "+ toplam);
    }
}
