package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalReserva {
    static void main() {
        Reserva r = new Reserva();
        r.reservar();
        r.reservar("15/04");
        r.reservar("15/04", 2);

        Reserva vip = new ReservaVip();
        vip.reservar();
    }
}
