package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class PrincipalBateria {
    static void main() {
        Bateria b = new Bateria();
        b.setNivelBateria(100);
        System.out.println("Status: " + b.exibirStatus());
    }
}
