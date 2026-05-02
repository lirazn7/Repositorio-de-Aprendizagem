package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class PrincipalCriarConta {
    static void main() {
        CriarConta conta = new CriarConta("Igor");
        conta.depositar(2000.00);
        conta.sacar(1200.00);
        conta.exibirSaldo();
    }
}
