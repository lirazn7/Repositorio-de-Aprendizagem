package br.com.alura.desafios.desafios2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEntrega {
    static void main() {
        LocalDate inicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataEntrega = inicio.plusDays(prazoDias);

        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataFormatada = dataEntrega.format(formatoBR);

        System.out.println("Data de entrega: " + dataFormatada);


    }


}
