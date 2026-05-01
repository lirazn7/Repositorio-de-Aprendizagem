package br.com.alura.desafios.desafios2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDateTest {
    static void main() {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025,5,15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterior ao dia do vencimento");
        }else {
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de conclusão da compra formatada: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNYC = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        System.out.println("Data conclusão de compra NYC: " + dataCompraNYC);

        LocalTime inicio = LocalTime.of(9, 8);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duration = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duration.toHours() + " horas e " +
                duration.toMinutesPart() + "minutos.");

        LocalDate dataPagamento = LocalDate.parse("2026-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());
    }
}
