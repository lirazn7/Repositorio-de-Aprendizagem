package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalSistBancario {
    static void main() {
        OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();
    }


}
