package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Push para %s\nTítulo: %s\nConteúdo: %s\n", destinatario
        , titulo, mensagem);
    }
}
