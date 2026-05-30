package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Midia {
    private String titulo;
    private int anoPubli;

    //construtor - se os outros dependentes dessa classe estiverem criados, ao
    //criar esse construtor, eles darão erro, e você terá que incluir outros
    //construtores nas outras classes com os atributos delas inclusos.
    public Midia(int anoPubli, String titulo) {
        this.anoPubli = anoPubli;
        this.titulo = titulo;
    }

    // pega o ano de publicação da Mídia
    public int getAnoPubli() {
        return anoPubli;
    }

    // pega o título da mídia
    public String getTitulo() {
        return titulo;
    }

    // gera o código para as mídias ao serem chamadas.
    public String gerarCodigo() {
        return "LIB-" + titulo.substring(0, 3) + anoPubli;
    }
}
