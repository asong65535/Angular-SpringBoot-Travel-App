package edu.wgu.d387_sample_code.timezone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public static String[] convertTimeZones() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");

        // Set time to 2025-10-11::12:30
        LocalDate presentationDate = LocalDate.of(2025, 10, 11);
        LocalTime presentationTime = LocalTime.of(12, 30);
        ZoneId etZone = ZoneId.of("America/New_York");

        ZonedDateTime etTime = ZonedDateTime.of(presentationDate, presentationTime, etZone);

        // Convert to MT
        ZoneId mtZone = ZoneId.of("America/Denver");
        ZonedDateTime mtTime = etTime.withZoneSameInstant(mtZone);

        // Convert to UTC
        ZoneId utcZone = ZoneId.of("UTC");
        ZonedDateTime utcTime = etTime.withZoneSameInstant(utcZone);

        // Format times
        String etTimeStr = formatter.format(etTime) + " Eastern Time";
        String mtTimeStr = formatter.format(mtTime) + " Mountain Time";
        String utcTimeStr = formatter.format(utcTime) + " UTC";

        return new String[] { etTimeStr, mtTimeStr, utcTimeStr };
    }
}
