package day20_arrays;

import day19_arrays.C04_kullanimAdediniBulma;

import java.util.Arrays;

public class C07_BinarySearch {
    public static void main(String[] args) {

        String[] harfler = {"a", "c", "r", "s", "a", "a", "s", "k", "a"};
        // verilen harfler array'inde "k" harfinin olup olmadigini yazdirin.

        C04_kullanimAdediniBulma.elemanArama(harfler,"k");

        // "A" var mi ?

        C04_kullanimAdediniBulma.elemanArama(harfler,"A");

        int [] arr1 = {3,9,1,17,5,2,20};

        // verilen arr1'de 2 varmı?

        System.out.println(Arrays.binarySearch(arr1, 2)); // -1
        System.out.println(Arrays.binarySearch(arr1, 20)); // 6
        System.out.println(Arrays.binarySearch(arr1, 1)); // -1
        System.out.println(Arrays.binarySearch(arr1, 17)); // 3
        System.out.println(Arrays.binarySearch(arr1, 3)); // 0
        System.out.println(Arrays.binarySearch(arr1, 5)); // -2
        System.out.println(Arrays.binarySearch(arr1, 9)); // 1

        // BinarySearch, binaryTree ozelligini kullandigindan
        // arama isleminden once mutlaka sort islemi yapilmalidir.
        // islemi yapilmadan BinarySearch kullanilirsa
        // sonuc ONGORULEMEZ, dogru da olabilir yanlis ta olabilir.

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1, 2)); // 1
        System.out.println(Arrays.binarySearch(arr1, 20)); // 6
        System.out.println(Arrays.binarySearch(arr1, 1)); // 0
        System.out.println(Arrays.binarySearch(arr1, 17)); // 5
        System.out.println(Arrays.binarySearch(arr1, 3)); // 2
        System.out.println(Arrays.binarySearch(arr1, 5)); // 3
        System.out.println(Arrays.binarySearch(arr1, 9)); // 4

        // olmayan bir eleman aratir isek  [1, 2, 3, 5, 9, 17, 20]
        // olmayan sayilarda OLMADIGINI belirtmek icin - kullanilir.
        // eger o sayi olsaydı kacinci index'te olacagini belirmek icin
        // ornegin 4 icin -4 yani 4 SIRA'da olurdu seklinde belirtiyor.
        System.out.println(Arrays.binarySearch(arr1, -3)); // -1
        System.out.println(Arrays.binarySearch(arr1, 0)); // -1
        System.out.println(Arrays.binarySearch(arr1, 4)); // -4
        System.out.println(Arrays.binarySearch(arr1, 6)); // -5
        System.out.println(Arrays.binarySearch(arr1, 18)); // -7
        System.out.println(Arrays.binarySearch(arr1, 50)); // -8
        System.out.println(Arrays.binarySearch(arr1, 100)); // -8




    }
}
