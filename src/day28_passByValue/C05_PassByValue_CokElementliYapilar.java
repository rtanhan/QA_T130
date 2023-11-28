package day28_passByValue;

import java.util.Arrays;

public class C05_PassByValue_CokElementliYapilar {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5};

        // verilen int array'in elementlerinin degerlerini
        // 2 artirip array'in yeni halini yazdiran bir method olusturun.

        System.out.println("Main method method call oncesi : " + Arrays.toString(arr));
        // Main method method call oncesi : [3, 4, 5]

        elementleri2ArtiripYazdir(arr); // [5, 6, 7]

        System.out.println("Main method method call sonrasi : " + Arrays.toString(arr));
        // Main method method call sonrasi : [5, 6, 7]

        // verilen Array'e 5 elemanli yeni bir array atayip
        // yeni halini yazdiran bir method olsturun.

        System.out.println("Main method 2. method call oncesi : " + Arrays.toString(arr));
        // Main method 2. method call oncesi : [5, 6, 7]

        yeniArrayAta(arr); // 2. Method'da Arr : [0, 0, 0, 0, 0]

        System.out.println("Main method 2.method call sonrasi : " + Arrays.toString(arr));
        // Main method 2.method call sonrasi : [5, 6, 7]

    }

    public static void elementleri2ArtiripYazdir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void yeniArrayAta(int[] arr) {

        arr = new int[5];
        System.out.println("2. Method'da Arr : " + Arrays.toString(arr));

    }
}
