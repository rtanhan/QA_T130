package day30_timeDate_Varargs;

import javax.lang.model.type.UnionType;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalUnit;

public class C01_LocalTime {

    public static void main(String[] args) {


        LocalTime saat = LocalTime.now();

        LocalTime saatUsa = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("USA eastern time saati : " + saatUsa);
        // USA eastern time saati : 12:47:00.135659900

        System.out.println(saat.plusHours(10000));  // 12:48:49.097212700

        System.out.println(saat.minusHours(3)
                .minusMinutes(15).minusSeconds(23));
        // 17:34:18.519254300

        System.out.println(saat.withMinute(27)); // 20:27:22.646509800

        System.out.println(saat.withSecond(0).withNano(0)); // 20:51

        System.out.println(saat.toNanoOfDay()); // 75201765747300
        // gece 00:00 dan baslayarak saatin olusturuldugu ana kadar gecen nanosaniye

        System.out.println(saat.toSecondOfDay()); // 75254
        // gece 00:00 dan baslayarak saatin olusturuldugu ana kadar gecen saniye

        LocalTime saat1 = LocalTime.of(10,45);
        LocalTime saat2 = LocalTime.of(14,12,23);

        System.out.println(saat1.isBefore(saat2)); // true

        System.out.println(saat1.isAfter(saat2)); // false




    }
}
