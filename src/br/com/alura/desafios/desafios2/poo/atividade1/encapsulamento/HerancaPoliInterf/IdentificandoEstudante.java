package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class IdentificandoEstudante {
    static void main() {
        Aluno aluno1 = new Aluno("Fernanda", "regular");
        Bolsista aluno2 = new Bolsista("Igor Lira");

        aluno1.identificar();
        aluno2.identificar();
    }

}
