package br.com.alura.desafios;

import java.util.Scanner;

public class CorrectPassword {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String senhaDef = "Igor150406";

        System.out.println("Digite a senha:");
        String senhaTentativa = sc.nextLine();

        sc.close();

        if (senhaTentativa.equals(senhaDef)){
            System.out.println("Acesso mais que permitido, patrão!");
        } else {
            System.out.println("Acesso negado, malandro!");
        }
    }
}
