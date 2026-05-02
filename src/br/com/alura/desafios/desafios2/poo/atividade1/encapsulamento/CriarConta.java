package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class CriarConta {
    private String titular;
    private double saldoInicial;

    public CriarConta(String titular) {
        this.titular = titular;
        this.saldoInicial = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoInicial += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar (double valor) {
        if (valor <= this.saldoInicial) {
            this.saldoInicial -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f\n", titular, saldoInicial);
    }
}
