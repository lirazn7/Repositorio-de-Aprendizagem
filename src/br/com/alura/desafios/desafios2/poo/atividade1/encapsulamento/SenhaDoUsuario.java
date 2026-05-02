package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class SenhaDoUsuario {
    //definindo a String que receberá a senha inserida pélo usuário
    private String senha;

    //definindo que a senha inicial será a que o usuário definir no início do código
    public SenhaDoUsuario(String senhaInicial) {
        this.senha = senhaInicial;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        //acima foi definido que o set terá que receber a senha atual + nova senha

        if (senhaAtual.equals(this.senha)) { /*se a senha atual inserida for
        igual a registrada no sistema */

            this.senha = novaSenha; // a senha interna do sistema se tornará a nova senha inserida no setSenha
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
