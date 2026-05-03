package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

import java.util.Scanner;

public class PrincipalLogin {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Login aluno = new Login("aluno2026", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.println("Digite o seu usuário: ");
            String usuario = sc.nextLine();

            System.out.println("Digite a sua senha: ");
            String senha = sc.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes --;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Login ou senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }

    }


}
