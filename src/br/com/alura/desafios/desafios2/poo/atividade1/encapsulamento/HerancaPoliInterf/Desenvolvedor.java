package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class Desenvolvedor extends Funcionario2{
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        // ele herda o this.nome e o de salario e somente insere o this.stack separado
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Desenvolvedor: %s | Salário: %.2f | Stack: %s",
                nome, salario, stack);
    }

    @Override
    public void calculaPLR() {
        System.out.println("PLR do dev");
    }
}
