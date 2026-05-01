package br.com.alura.desafios.desafios2.poo.atividade1;

public class ZerandoSaldo {
    double saldo;

    public void zeraSaldo() {
        saldo = 0.0;
    }

    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    static void main() {
        ZerandoSaldo conta = new ZerandoSaldo();

        conta.saldo = 1579.42;

        conta.exibirSaldo();
        conta.zeraSaldo();
        conta.exibirSaldo();
    }
}
