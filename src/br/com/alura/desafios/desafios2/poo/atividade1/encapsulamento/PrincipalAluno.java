package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class PrincipalAluno {
    static void main() {
        Aluno aluno = new Aluno("Igor");

        aluno.ganharPontos(200);
        aluno.exibirStatus();

    }
}
