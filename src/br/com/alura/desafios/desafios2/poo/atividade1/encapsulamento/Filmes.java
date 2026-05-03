package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

import java.util.ArrayList;

public class Filmes {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public Filmes(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida. Por favor, informe uma nota de 1 a 5.");
        }
    }

    public ArrayList<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Integer> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double calculaMedia() {
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
