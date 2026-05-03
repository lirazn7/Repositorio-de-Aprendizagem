package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class PrincipalFilmes {
    static void main() {
        Filmes matrix = new Filmes("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(3);

        System.out.printf("Média de avaliações para %s: %.2f", matrix.getTitulo(), matrix.calculaMedia());
    }
}
