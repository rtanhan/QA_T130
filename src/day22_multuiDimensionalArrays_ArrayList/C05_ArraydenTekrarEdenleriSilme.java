package day22_multuiDimensionalArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elentleri silip
        // array'i her elementin sadece bir kere kullanildigi hale getirin.

        int [] arr = {3,6,1,4,7,3,9,4,2,3,6,1,6,3};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println(tekrarsizList);

        // tekrarsiz hale gelen array DEGIL, Bizim olusturdugumuz liste.
        // array'e yeni bir array degeri atayip
        // listedeki elementleri yeni array'e tasimaliyiz.

        arr = new int[tekrarsizList.size()]; // [0,0,0,0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrarsizList.get(i);

        }
        Arrays.sort(arr);
        System.out.println("Array'in son hali : "+Arrays.toString(arr));

    }
}
