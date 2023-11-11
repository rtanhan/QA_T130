package day16_methodOlusturma_methodOverloading;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // 1'den 20'ye kadar (sinirlar dahil) olan tam sayilari toplayin.

        int toplam = 0;

        for (int i = 1; i <= 20; i++) {
            toplam = toplam + i;

        }
        System.out.println(toplam); // 210

        // While loop olusturulurken baslangic degeri
        // bitis sarti ve artis seklini otomatik olusturmaz.
        // bunlari bizim manuel olarak yapmamiz gerekir.
        // eger for loop yapilabilen bir soru varsa
        // for loop tercih edilir.

        toplam = 0;
        int baslangic = 1;
        int son = 20;

        while (baslangic <= son) {
            toplam = toplam + baslangic;
            baslangic++;
        }
        System.out.println(toplam); // 210

        // eger tekrar sayisi belli degil ise
        // for loop yerine while loop kullanmayi tercih ederiz.
    }
}
