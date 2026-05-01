package br.com.alura.desafios;

import java.util.Scanner;

public class ParOuImpar2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número:");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
    }
}
