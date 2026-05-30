package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalFuncionario2 {
    static void main() {
        Funcionario2 gerente = new Gerente("Mario", 30000);
        //foi necessario fazer um typecast abaixo para gerente, para conseguir entender que precisa usar o setBonus
        ((Gerente) gerente).setBonus(2000);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);
        ((Gerente) gerente).aprovarProjeto("Implementação de IA nos códigos Java");


        Funcionario2 dev = new Desenvolvedor("Igor", 17000, "Backend Java");
        dev.reajustarSalario();
        dev.exibirInformacoes();



    }

}
