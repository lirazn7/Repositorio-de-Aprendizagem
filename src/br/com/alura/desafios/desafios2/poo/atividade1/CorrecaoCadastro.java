package br.com.alura.desafios.desafios2.poo.atividade1;

public class CorrecaoCadastro {
    String nome;
    String cargo;
    int nivelAcesso;

    void promocao(String novoCargo, int novoNivel) {
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");

        cargo = novoCargo;
        nivelAcesso = novoNivel;

        System.out.println("--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de acesso: " + nivelAcesso + "\n");

    }

    static void main() {
        CorrecaoCadastro colaborador = new CorrecaoCadastro();
        colaborador.nome = "Igor Lira";
        colaborador.cargo = "Desenvolvedor Pleno";
        colaborador.nivelAcesso = 2;

        colaborador.promocao("Staff Software Engineer", 5);
    }
}
