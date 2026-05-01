package br.com.alura.desafios;

import java.util.Scanner;

public class InvalidName {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String name;

        do {
            System.out.println("Digite seu nome:");
            name = sc.nextLine();
            if (name.length() < 3) {
                System.out.println("Nome inválido, tente novamente");
            }
        }while (name.length() < 3);
            System.out.println("Nome \"" + name + "\" cadastrado com sucesso!");
            sc.close();
    }
}
