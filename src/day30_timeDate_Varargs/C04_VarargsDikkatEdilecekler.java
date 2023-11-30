package day30_timeDate_Varargs;

public class C04_VarargsDikkatEdilecekler {
    public static void main(String[] args) {

        // argument olarak verilen yasilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplami ilk sayi ile carpip
        // sonucu yazdiran bir method olusturun.

        // input = 0,2,3,4,1    output ==> 0 * 10 = 0
        // input = 1,2,3        output ==> 1* 5 = 5

        islemyap(0,2,3,4,1); // 0
        islemyap(1,2,3); // 5
        islemyap(2,3,4,5,6,7,8,9); // 84
        islemyap(5); // 0
        // varargs cok elemani sorun etmedigi gibi
        // hic eleman verilmemesinide sorun etmez.

        // islemyap(); CTE array bos kalabilir ama bastaki parametre bos kalmaz.




    }

    public static void islemyap(int ilksayi, int... geriyekalanlar) {

        int toplam = 0;

        for (int each : geriyekalanlar
             ) {
            toplam = toplam + each;
        }
        System.out.println(toplam*ilksayi);

    }
}
