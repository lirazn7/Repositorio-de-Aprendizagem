package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Ebook extends Midia{
    private String formato;

    public Ebook(int anoPubli, String titulo, String formato) {
        super(anoPubli, titulo);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: "+ getTitulo() + " | Formato: " + getFormato());
    }
}
