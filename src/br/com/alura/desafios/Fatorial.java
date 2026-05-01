package br.com.alura.desafios;

import java.util.Scanner;

public class Fatorial {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int number = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i < number; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + number + " é: " + fatorial);
        sc.close();
    }
}
