package br.com.alura.desafios.desafios2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DiferencaHoras {
    static void main() {
        LocalTime inicio = LocalTime.of(14, 30);
        LocalTime fim = LocalTime.of(16,45);

        Duration duration = Duration.between(inicio, fim);
        System.out.println("Diferença de tempo: " + duration.toHours() +
                " horas e " + duration.toMinutesPart() + " minutos");
    }
}
