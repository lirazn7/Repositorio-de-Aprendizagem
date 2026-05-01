package br.com.alura.desafios;

import java.util.Scanner;

public class List {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço:");
        String[] numberList = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numberList) {
            int num = Integer.parseInt(numStr);
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();

    }
}
