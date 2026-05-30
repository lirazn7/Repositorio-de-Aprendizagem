package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

import br.com.alura.desafios.AprovadorFuncionario2;

public class Gerente extends Funcionario2 implements AprovadorFuncionario2 {

    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //um metodo com o mesmo nome para sinalizar a sobrescrita do
    // metodo da classe funcionario porem com informações diferentes
    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Salário: %.2f | Bônus: %.2f",
                nome, salario, bonus);
    }

    @Override
    public void calculaPLR() {
        System.out.println("PLR do gerente");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\nGerente %s aprovou o projeto %s", nome, nomeProjeto);
    }
}
