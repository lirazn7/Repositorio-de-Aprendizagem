package br.com.alura.desafios;

import java.util.Scanner;

public class CodeVerification {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int realCode = 2023;


        System.out.println("Digite o código de acesso: ");
        int code = scanner.nextInt();
        System.out.println("Digite o nível de permissão");
        int permLevel = scanner.nextInt();


        if (code != realCode && permLevel > 3){
            System.out.println("Acesso negado. Tente novamente.");
        } else if (code != realCode && permLevel < 1) {
            System.out.println("Acesso negado. Tente novamente");
        } else {
            System.out.println("Acesso permitido. Bem vindo ao sistema!");
        }
    }
}
