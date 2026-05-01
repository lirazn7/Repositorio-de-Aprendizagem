package br.com.alura.desafios.desafios2.poo;

public class POO {
    static void main() {
        //o ideal é criar uma classe para representar os funcionários
        Funcionario funcionario1 = new Funcionario(12000, "Ana");
        funcionario1.setCargo("Project Management");


        Funcionario funcionario2 = new Funcionario(20000, "João");
        funcionario2.setCargo("Java Senior Developer");

        System.out.println("Funcionário tem o cargo " + funcionario2.getCargo());
        System.out.println("Funcionário tem o nome " + funcionario2.getNome());
        System.out.println("Funcionário tem o salário " + funcionario2.getSalario());

        funcionario2.reajusteSalario(20);
        funcionario2.reajusteSalario(10);
        funcionario2.exibirInformacoes();
    }
}
