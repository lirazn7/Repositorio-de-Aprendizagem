package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Aluno1 extends Pessoa{
    private double nota;

    public Aluno1(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + " | Idade: " + getIdade()
        + " | Nota: " + nota);
    }
}
