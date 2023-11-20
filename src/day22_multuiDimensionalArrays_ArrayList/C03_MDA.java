package day22_multuiDimensionalArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {


        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
                yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
                input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
                output:                      [5, 7, 11]
         */

        // outpu array'i kisa inner array'in uzunluguna esit olacak.
        // once x tane inner array'e gore soruyu cozelim. dinamik olacak sekilde.

        int[][] arr = {{3, 4, 5, 1, 2}, {2, 3, 6, 7, 5}, {3, 5, 8, 4, 6}, {2, 4,5}};

        // output'un uzunlugu en kisa array'in uzunluguna esit olacak.
        // ozaman en kisa inner array'in uzunlugunu bulalim.

        int enKisaInnerLength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < enKisaInnerLength) {
                enKisaInnerLength = arr[i].length;
            }
        }
        int [] output = new int[enKisaInnerLength];

        for (int i = 0; i < output.length; i++) { // output'un icine konacak index
            for (int j = 0; j < arr.length; j++) { // arr'deki her bir inner array'in elementini bulacak toplanacak elementler.
                output[i] += arr[j][i];
            }
        }
        System.out.println(Arrays.toString(output));

    }
}
