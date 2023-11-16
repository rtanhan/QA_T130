package day20_arrays;

import java.util.Arrays;

public class C06_Sort {
    public static void main(String[] args) {

        String [] isimler ={"Seher","Selim","Songul","Saido","Ali","Sedat"};

        System.out.println(Arrays.toString(isimler)); // [Seher, Selim, Songul, Saido, Ali, Sedat]

        Arrays.sort(isimler);

        // Natural Order ( doğal sıralama )
        System.out.println(Arrays.toString(isimler)); // [Ali, Saido, Sedat, Seher, Selim, Songul]

        // verilen bir int array'deki
        // en kucuk ve en buyuk sayilari yazdirin.

        int [] array1 = {5,1,9,6,4,8,2,6,3,1,7};

        Arrays.sort(array1);

        int enKucukSayi = array1[0];
        int enBuyukSayi = array1[array1.length-1];

        System.out.println("En kucuk sayi : " + enKucukSayi + " En Buyuk Sayi : "+enBuyukSayi);
    }
}
