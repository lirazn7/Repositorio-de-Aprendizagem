package br.com.alura.desafios.desafios2.poo.atividade1;

public class MultagemAtraso {
    String titulo;
    int diasAtraso;

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirDetalhes() {
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, diasAtraso, multa);
    }

    static void main() {
        MultagemAtraso pedido = new MultagemAtraso();
        pedido.titulo = "Entendendo Algoritmos";
        pedido.diasAtraso = 3;

        pedido.exibirDetalhes();
    }
}
