package br.com.alura.desafios.desafios2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataPagamento {
    static void main() {
        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);
        int anetecedenciaDias = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(anetecedenciaDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        String dataFormatada = dataLembrete.format(formatter);

        System.out.println("Data do lembrete: " + dataFormatada);
    }
}
