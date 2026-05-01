package br.com.alura.desafios;

public class CadastroLivros {
    static void main() {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numPag = 96;
        double priceBook = 39.90;
        char categoria = 'F';

        String categoriaDescricao = "";

        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            System.out.println("Categoria inválida");
        }
        System.out.println("Livro cadastrado: " + titulo
                + ", de " + autor + ". Ele possui "
                + numPag + " páginas, custa " + priceBook
                + " e pertence à categoria " + categoriaDescricao + ".");
    }
}
