package br.com.alura.desafios;

import java.util.Scanner;

public class Emprestimo {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double value = scanner.nextDouble();

        scanner.close();

        if (value <= 999.99){
            System.out.println("O valor " + value + " não está dentro do " +
                    "intervalo permitido para empréstmo.");
        } else if (value > 4999.99) {
            System.out.println("O valor " + value + " não está dentro do " +
                    "intervalo permitido para empréstmo.");
        } else {
            System.out.println("O valor " + value + " está dentro do intervalo " +
                    "permitido para empréstimo.");
        }
    }
}
