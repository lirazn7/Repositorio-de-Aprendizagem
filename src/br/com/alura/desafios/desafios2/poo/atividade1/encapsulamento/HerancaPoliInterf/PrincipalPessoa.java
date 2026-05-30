package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalPessoa {


    static void main() {
        Aluno1 aluno = new Aluno1("Igor", 20, 9.9);
        Aluno1 aluno2 = new Aluno1("João Victor", 19, 10);
        Docente docente = new Docente("Ricardo", 50, "Gerenciamento de Serviços de TI");
        Docente docente2 = new Docente("Andre Pitkowski", 71, "Governança de TI");


        aluno.exibirDados();
        aluno2.exibirDados();

        docente.exibirDados();
        docente2.exibirDados();

    }
}
