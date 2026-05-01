package br.com.alura.desafios.desafios2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatterDateTime {
    static void main() {
        LocalDate currentDate = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = currentDate.format(dateFormatter);
        String horaFormatada = horaAtual.format(hourFormatter);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);

    }
}
