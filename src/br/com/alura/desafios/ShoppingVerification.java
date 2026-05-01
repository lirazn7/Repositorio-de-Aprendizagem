package br.com.alura.desafios;

import java.util.Scanner;

public class ShoppingVerification {
    static void main() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor >= 100.00) {
            double discount = valor * 0.10;
            double valueWthDiscount = valor - discount;
            System.out.println("Desconto de 10% aplicado\nNovo valor: R$" + valueWthDiscount);
        } else {
            System.out.println("Tem desconto pa tu não, liso!\nValor total: R$" + valor);
        }
    }
}
