package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

import java.util.ArrayList;

public class PrincipalAgendaContato {
    static void main() {
        ArrayList<AgendaContato> contatos = new ArrayList<>();

        contatos.add(new AgendaContato("Igor Lira", "(11) 95355-3708"));
        contatos.add(new AgendaContato("Rosana Lira", "(11) 99244-1860"));
        contatos.add(new AgendaContato("Rafael Lira", "(11) 95355-3708"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (AgendaContato contato : contatos) {
            System.out.printf("%d. %s | %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());
        }

    }


}
