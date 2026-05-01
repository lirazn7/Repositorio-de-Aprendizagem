package br.com.alura.desafios.desafios2.poo.atividade1;

public class ControleTemperatura {
    String local;
    double temperaturaAtual;

    void relatorioAtual() {
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f ºC\n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }

    static void main() {
        ControleTemperatura sensor = new ControleTemperatura();
        sensor.local = "Setor A";
        sensor.temperaturaAtual = 39.2;

        sensor.relatorioAtual();
    }
}
