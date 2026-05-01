package br.com.alura.desafios.desafios2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HoraEmToquio {
    static void main() {
        ZonedDateTime horaemToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioFormatado = horaemToquio.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horarioFormatado);
    }
}
