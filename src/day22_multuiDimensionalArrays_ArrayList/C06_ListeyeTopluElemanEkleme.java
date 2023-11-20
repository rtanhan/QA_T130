package day22_multuiDimensionalArrays_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ListeyeTopluElemanEkleme {
    public static void main(String[] args) {

        // eger yeni olusturdugumuz bir List'e toplu olarak
        // eleman eklemek istersek array olusturup loop ile
        // liste tek seferde ekleyebiliriz. En guvenli yol budur.

        int [] arr = {3,5,2,1,5,3,6,8,2,3,4,5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [3, 5, 2, 1, 5, 3, 6, 8, 2, 3, 4, 5]

    }
}
