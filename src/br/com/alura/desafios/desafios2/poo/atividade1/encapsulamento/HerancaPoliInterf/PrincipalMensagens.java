package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalMensagens {
    static void main() {
        Notificador notificador = new Notificador();

        notificador.enviarMensagem("Olá!");
        notificador.enviarMensagem("João", "Bom dia!");
        notificador.enviarMensagem("Maria", "Atenção", 2);

    }
}
