package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class PrincipalDisciplina {

    static void main() {
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(9.5);
        matematica.adicionarNota(7.9);
        matematica.adicionarNota(-2.0);
        matematica.adicionarNota(10);

        System.out.println("Total de notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Média em %s: %.2f\n", matematica.getNome(), matematica.calcularMedia());
    }

}
