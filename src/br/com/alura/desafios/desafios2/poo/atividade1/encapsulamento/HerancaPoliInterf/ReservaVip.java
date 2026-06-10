package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

import javax.naming.spi.ResolveResult;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReservaVip extends Reserva {

    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
