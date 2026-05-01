package br.com.alura.desafios.desafios2.poo.atividade1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }

    static void main() {
        CarrinhoDeCompras i1 = new CarrinhoDeCompras();
        i1.nome = "Teclado Gamer";
        i1.preco = 200.50;
        i1.quantidade = 3;

        CarrinhoDeCompras i2 = new CarrinhoDeCompras();
        i2.nome = "Mouse Logitech";
        i2.preco = 120.0;
        i2.quantidade = 5;

        List<CarrinhoDeCompras> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (CarrinhoDeCompras item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);

    }
}