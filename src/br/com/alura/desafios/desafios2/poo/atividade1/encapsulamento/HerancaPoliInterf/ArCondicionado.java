package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class ArCondicionado implements Controlavel {
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ar-condicionado ligado.");
        } else {
            System.out.println("Ar-condicionado já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Ar-condicionado desligado.");
        } else {
            System.out.println("Ar-condicionado já está desligado.");
        }
    }
}
