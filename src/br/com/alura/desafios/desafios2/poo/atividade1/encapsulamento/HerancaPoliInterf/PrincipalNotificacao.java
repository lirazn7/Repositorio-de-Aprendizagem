package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalNotificacao {
    static void main() {
        Email email = new Email("nathanlira15@gmail.com", "Você foi " +
                "efetivado!", "Aviso de efetivação");

        SMS sms = new SMS("(11) 95355-3708",
                "Sua conta TIM foi paga com êxito");

        Push push = new Push("igorzn7",
                "Você tem uma nova mensagem não lida",
                "Novidade!!");

        email.enviar();
        sms.enviar();
        push.enviar();


    }

}
