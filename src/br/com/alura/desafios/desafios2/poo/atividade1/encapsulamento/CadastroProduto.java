package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class CadastroProduto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double valor) {
        if (valor >= 0) {
            preco = valor;
        } else {
            System.out.println("Preço inválido.");
        }
    }
}
