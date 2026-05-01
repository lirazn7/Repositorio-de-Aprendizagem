package br.com.alura.desafios.desafios2.poo.atividade1;

public class ResumoLivro {
    String titulo;
    String autor;
    int paginas;

    public void resumoFormatado(){
        System.out.printf("%s de %s com %s páginas", titulo, autor, paginas);
    }

    static void main() {
        ResumoLivro livro1 = new ResumoLivro();
        livro1.titulo = "Entendendo Algoritmos";
        livro1.autor = "Adiya Y. Bhargava";
        livro1.paginas = 263;
        livro1.resumoFormatado();
    }
}
