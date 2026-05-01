package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class AgendaContato {
    private final String nome;
    private final String telefone;

    public AgendaContato (String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
