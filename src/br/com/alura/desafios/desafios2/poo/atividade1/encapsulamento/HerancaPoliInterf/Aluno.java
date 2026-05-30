package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Aluno {
    String nome;
    String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificar() {
        System.out.println("Aluno: " + nome + " - Tipo: " + tipo);
    }
}
