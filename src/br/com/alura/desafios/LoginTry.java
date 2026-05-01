package br.com.alura.desafios;

import java.util.Scanner;

public class LoginTry {
    static void main() {
        Scanner sc = new Scanner(System.in);
        final String correctPassword = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite sua senha:");
            String password = sc.nextLine();


            if (password.equals(correctPassword)) {
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1)
                        + " tentativas restantes");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
        sc.close();
    }
}
