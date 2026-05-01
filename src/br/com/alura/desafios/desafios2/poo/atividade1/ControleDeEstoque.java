package br.com.alura.desafios.desafios2.poo.atividade1;

public class ControleDeEstoque {
    String nome;
    int quantidade;

    void bemBolado(int qtdVendida) {
        if (qtdVendida <= quantidade){
            quantidade -= qtdVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        }else {
            System.out.println("Estoque insuficiente!");
        }
    }

    static void main() {
        ControleDeEstoque item = new ControleDeEstoque();
        item.nome = "Blusa QuintoAndar";
        item.quantidade = 10;

        item.bemBolado(3);
        item.bemBolado(8);
    }
}
