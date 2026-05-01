package br.com.alura.desafios;

public class ClassificacaoCategoria {
    static void main() {
        double preco = 150.00;

        if (preco <= 50.00) {
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50 && preco <=200.00) {
            System.out.println("Categoria do produto: Intermediário");
        } else if (preco > 200) {
            System.out.println("Categoria do produto: Premium");
        } else {
            System.out.println("Categoria inválida");
        }
    }
}
