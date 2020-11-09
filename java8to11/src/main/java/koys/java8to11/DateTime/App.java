package koys.java8to11.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {

        //시간
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        // 기간
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2020, Month.MARCH, 25);

        Period period = Period.between(today, thisYearBirthday);
        System.out.println(period.getDays());
        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));
    }

}
