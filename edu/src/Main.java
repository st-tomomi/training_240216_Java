import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // 穴埋め部
        // LocalDateTimeは入社のころよく書いた記憶があるので今回は使わない
        ZonedDateTime timeJPN = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("西暦uuuu年MM月dd日(E) ahh時mm分ss秒 zzzz");
        System.out.println(timeJPN.format(formatter));

        LocalDateTime jpnDateTIme = LocalDateTime.of(2020, Month.MARCH, 1, 0, 0, 0);
        ZonedDateTime jstDateTime = ZonedDateTime.of(jpnDateTIme, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime utcDateTime = jstDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("西暦uuuu年MM月dd日(E) ahh時mm分ss秒 '協定世界時'");
        System.out.println(utcDateTime.format(formatter2));

        LocalDateTime pstDateTime = LocalDateTime.of(2017, Month.NOVEMBER, 5, 1, 0, 0);
        ZonedDateTime pstDateTime2HoursLater = ZonedDateTime.of(pstDateTime, ZoneId.of("America/Los_Angeles"))
                .plusHours(2);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("西暦uuuu年MM月dd日(E) ahh時mm分ss秒 zzzz");
        System.out.println(pstDateTime2HoursLater.format(formatter3));
    }
}
