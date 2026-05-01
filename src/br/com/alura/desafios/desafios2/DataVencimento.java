package br.com.alura.desafios.desafios2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataVencimento {
    static void main() {
        LocalDate dataDeVencimento = LocalDate.of(2026, 5, 23);
        int mesesDeAdiamento = 1;
        LocalDate novaDataVencimento = dataDeVencimento.plusMonths(mesesDeAdiamento);

        DateTimeFormatter diaFormatado = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataFOrmatada = dataDeVencimento.format(diaFormatado);

        System.out.println("Nova data de vencimento: " + dataFOrmatada);
    }
}
