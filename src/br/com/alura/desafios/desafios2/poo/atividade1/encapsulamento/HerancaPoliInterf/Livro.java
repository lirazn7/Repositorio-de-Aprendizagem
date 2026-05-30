package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Livro extends Midia{
    private String autor;

    public Livro(int anoPubli, String titulo, String autor) {
        super(anoPubli, titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: " + getTitulo()
        + " | Autor: " + getAutor());
    }
}
