package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalMidia {
    static void main() {
        Ebook ebook1 = new Ebook(1979, "O Guia do Mochileiro das Galáxias"
        , "Douglas Adams");
        Revista revista1 = new Revista(2023, "National Geographic"
        , 245);
        Livro livro1 = new Livro(2008, "Clean Code", "PDF");

        livro1.exibirInfo();
        ebook1.exibirInfo();
        revista1.exibirInfo();
    }
}
