package day22_multuiDimensionalArrays_ArrayList;

import java.util.Arrays;

public class C02_MDA {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
                yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
                output:                      [5, 7, 11]
         */

        // outpu array'i kisa inner array'in uzunluguna esit olacak.
        // once 2 tane inner array'e gore soruyu cozelim.

        int[][] arr = {{3, 4, 5, 1, 2}, {2, 3, 6, 7, 5}};

        int outputLength = arr[0].length > arr[1].length ? arr[1].length : arr[0].length;
        int[] output1 = new int[outputLength]; // [0,0,0] default olusturdu.

        for (int i = 0; i < output1.length; i++) {
            output1[i] = arr[0][i] + arr[1][i];
        }

        System.out.println(Arrays.toString(output1));
    }

}

