package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Revista extends Midia{
    private int edicao;

    public Revista(int anoPubli, String titulo, int edicao) {
        super(anoPubli, titulo);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: " + getTitulo()
        + " | Edição: " + getEdicao());
    }
}
