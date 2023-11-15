package day19_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        int arr1 = 20; // standat int variable
        arr1 = 30; // eger bu variable'a yeni deger atarsak java eskisini siler.

        int[] arr2 = {3, 4, 5}; // bir int deger'i array olarak atamak icin [] koseli parantez mutlaka kulanilmali.
        // burada data turu : int deklare edilmis
        // uzunluk deklare edilmemis ancak tanimlanan eleman sayisi yani - uzunluk : 3

        // array'de herhangi bir elemana ulasmak veya deger atamak istersek
        // index kullanidir.

        System.out.println(arr2[2]); // array sembolunun icerisine index numarasi yazilir. - 5
        System.out.println(arr2[1]); // 4 yazdirir.

        // arr2'nin icerisindeki 4 yerine 8 degerini atamak icin array sembolu icerisine
        // index numarasi yazilir.
        arr2[1] = 8;

        // bu array 3 elemanli olarak olusturldu.
        // 4 eleman olarak 3. index'e atama yapmak istersek
        // Java syntax olarak islem dogru oldugundan altini cizmez yani hata vermez.
        // ama intelij out of bands uyarisi verir.
        // calistirdiğimiz zaman
        // Array index is out of bounds

        // arr2[3] = 20; //  ArrayIndexOutOfBoundsException hatasi verir.

        // arraydeki tum elementleri yazdirin.

        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);

        int[] arr3 = {2, 3, 4, 5, 7, 5, 4, 2, 43523, 23452, 1,};

        // arr3'un tum elemenlerini yazdirin.

        for (int i = 0; i < arr3.length; i++) {  // 2 3 4 5 7 5 4 2 43523 23452 1
            System.out.print(arr3[i] + " ");
        }
        System.out.println("");

        // arr3 array'ini yazdirin.
        System.out.println("Tum Array : " + arr3); // [I@4cb2c100 Memory'deki degerini yazdirir.

        // Array non-pirimitive bir java objesidir.
        // non-pirimitive'lerin bazilari direk olarak yazdirilabilir.
        // ANCA Array'ler direk YAZDIRILAMAZ...

        // Ager Array'in tamamini yazdirmak istersek
        // Java'daki Arrays class'indan yardım almamiz gerekir.

        System.out.println(Arrays.toString(arr3)); //  [2, 3, 4, 5, 7, 5, 4, 2, 43523, 23452, 1]

        // 1 - Array'in tum elementlerini yazdirin denirse.
        // for loop ile elemetler tek tek yazdirilir.
        // 2 - Array'i direk yazdirmak isterske bize Memory'de bulunan referans degerini yazdirir.
        // 3 - Arrays clasından yardim alinarak yazdirildigi zaman
        // JAva tum elementleri [] içerisine sirali bir sekilde yazdirir ve her eleman arasina bir
        // virgul + bosluk koyarak yazdirir. Arrays.toString(arr3)

        int [] arr4 = new int [5];
        // Java bu kodu gordugunde icine 5 tane int degeri alacak bir Array olusturur.
        // bu durumda deger atanmadigi icin Java biz deger atayincaya kadar
        // elementlere default degerleri tanimlar.

        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0, 0]
        arr4[0] = 6;
        arr4[3] = 9;
        arr4[1] = 2;

        System.out.println(Arrays.toString(arr4)); // [6, 2, 0, 9, 0]
        // atama yapilanlar guncellenir atama yapilmayan elementler default degerde kalmaya devam eder.



    }
}
