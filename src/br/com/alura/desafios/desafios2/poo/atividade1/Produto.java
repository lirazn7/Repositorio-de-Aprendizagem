package br.com.alura.desafios.desafios2.poo.atividade1;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void dadosFormatados(){
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    static void main() {
        Produto p = new Produto();
        p.nome = "Mouse Gamer";
        p.preco = 200.0;
        p.quantidade = 31;

        p.dadosFormatados();
    }
}
