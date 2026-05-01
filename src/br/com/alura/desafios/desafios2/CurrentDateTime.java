package br.com.alura.desafios.desafios2;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDateTime {
    static void main() {
        String tarefa = "Enviar relatório semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Current date: " + dataCriacao);
        System.out.println("Current hour: " + horaCriacao);
    }
}
