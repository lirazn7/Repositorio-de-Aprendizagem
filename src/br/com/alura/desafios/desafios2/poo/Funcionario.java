package br.com.alura.desafios.desafios2.poo;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int controleReajuste = 0;

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    //todos os funcionarios terao esses atributos

    public void exibirInformacoes() {
        System.out.printf("\nFuncionario %s - Cargo: %s - Salário %.2f",
                 nome, cargo, salario);
    }

    public void reajusteSalario(double percentual) {
        if (controleReajuste >= 1) {
            System.out.println("\nNão pode fazer reajustes.");
        }else {
            controleReajuste++;
            salario += salario * (percentual/100);
            System.out.printf("\nNovo salário de %s é %.2f", nome, salario);
        }

    }
}
