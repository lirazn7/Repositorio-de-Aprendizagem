package br.com.alura.desafios;

import java.util.Scanner;

public class UtilDay {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();
        scanner.close();

        if (dia.equals("segunda") || dia.equals("terça")
        || dia.equals("quarta") || dia.equals("quinta")
        || dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia + " é dia de preguiça paizão");
        } else {
            System.out.println("Digita certo anta KKKKKK");
        }
    }
}
