package br.com.alura.desafios;

import java.util.Scanner;

public class JumpFive {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int limite = scanner.nextInt();

        for (int i = 1; i < limite; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.println(i + " ");
        }
        scanner.close();
    }
}
