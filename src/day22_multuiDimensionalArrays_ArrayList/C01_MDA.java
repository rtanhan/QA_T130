package day22_multuiDimensionalArrays_ArrayList;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7},{5,6,1}};
        int toplam = 0;

        // bu array'deki tum elementlerin toplamini yazidirin.

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam = toplam + arr[i][j];

            }

        }
        System.out.println("Tum elementlerin toplami : " +toplam);


        /*

        Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
                yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input :     int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
                output:                      [10, 3, 12, 10, 9]
         */

        int [] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            toplam = 0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            output[i] = toplam;
        }
        System.out.println(Arrays.toString(output));


        int[][] arr2 = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] yeniArr= new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                yeniArr[i] += arr2[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));




    }
}
