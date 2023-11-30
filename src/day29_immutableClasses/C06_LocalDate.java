package day29_immutableClasses;

import java.time.LocalDate;

public class C06_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        LocalDate dogunTarihi = LocalDate.of(1980,07,29);

        System.out.println(tarih); // 2023-11-29
        System.out.println(dogunTarihi); // 1980-07-29

        // plus method'lari ile tarihte ileri gidebiliriz.
        System.out.println(tarih.plusWeeks(23)); // 2024-05-08

        System.out.println(tarih.plusWeeks(3).plusDays(5).plusMonths(5).
                plusYears(6)); // 2030-05-25

        // minus...() ile tarihte geriye gidebiliriz.

        System.out.println(tarih.minusYears(5).minusMonths(3)); // 2018-08-29

        // tarihin istedigimiz bir bolumunu istedigimiz deger ile degistirebilriz.
        // with method'lari ile.

        System.out.println(tarih.withYear(1980)); // 1980-11-29

        System.out.println(tarih.withDayOfYear(134)); // 2023-05-14 yilin 134'uncu gunu.

        System.out.println(tarih.isLeapYear()); // false


    }
}
