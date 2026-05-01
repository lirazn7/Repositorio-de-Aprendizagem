package br.com.alura.desafios.desafios2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HorasSydney {
    static void main() {

        ZonedDateTime SystemHour = ZonedDateTime.now();
        ZonedDateTime SydneyHour = SystemHour.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String systemFormat = SystemHour.format(formatter);
        String sydneyFormat = SydneyHour.format(formatter);

        System.out.println("Horário atual do sistema: " + systemFormat);
        System.out.println("Horário atual em Sydney: " + sydneyFormat);

    }
}
