package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public abstract class Funcionario2 {

    // atributos
    protected String nome;
    protected double salario;

    // método construtor
    public Funcionario2(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // métodos:

    public void exibirInformacoes() {
        System.out.printf("\nFuncionário: %s | Salário: %.2f",
                nome, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salário de %s é %.2f\n", nome, salario);
    }

    public void reajustarSalario() {
        salario += 500;
        System.out.printf("\nSalário com dissídio de %s é %.2f\n", nome, salario);
    }

    public abstract void calculaPLR() ;

}