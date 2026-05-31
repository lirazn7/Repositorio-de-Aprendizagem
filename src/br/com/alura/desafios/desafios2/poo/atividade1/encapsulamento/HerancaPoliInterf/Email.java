package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s\n"
        , destinatario, assunto, mensagem);
    }
}
