package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class PrincipalCadastroProduto {
    static void main() {
        CadastroProduto p1 = new CadastroProduto();
        p1.setNome("Mouse");
        p1.setPreco(-59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", p1.getNome(), p1.getPreco());
    }
}
