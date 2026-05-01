package br.com.alura.desafios.desafios2.poo.atividade1;

public class CalculoDeNotas {
    String nome;
    double nota1;
    double nota2;

    void mediaNotas() {
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.printf("Média: %.1f\n", media);

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    static void main() {
        CalculoDeNotas calculo = new CalculoDeNotas();

        calculo.nome = "Igor";
        calculo.nota1 = 9.0;
        calculo.nota2 = 7.4;

        calculo.mediaNotas();
    }
}
