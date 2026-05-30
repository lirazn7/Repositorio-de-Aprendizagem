package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Docente: " + getNome() + " | Idade: " + getIdade()
        + " | Disciplina: " + disciplina);
    }
}
