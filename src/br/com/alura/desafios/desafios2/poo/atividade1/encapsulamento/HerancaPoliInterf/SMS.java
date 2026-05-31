package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class SMS extends Notificacao{

    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s\n", destinatario
        , mensagem);
    }
}
