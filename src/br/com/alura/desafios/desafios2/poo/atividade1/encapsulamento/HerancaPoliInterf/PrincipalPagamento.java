package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalPagamento {
    static void main() {
        Pagamento cartao = new CartaoCredito(1000);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(786.99);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

    }
}
