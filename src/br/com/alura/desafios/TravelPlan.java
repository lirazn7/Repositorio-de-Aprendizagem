package br.com.alura.desafios;

import java.util.SortedMap;

public class TravelPlan {
    static void main() {


        double consumoMedio = 12.5;//O carro faz 12,5 km por litro
        double capacidadeTanque = 50;//O tanque tem capacidade para 50 litros
        double combustívelAtual = 20;// 20 litros disponível
        double distanciaViagem = 200;//A viagem planejada tem 200 km

        double autonomiaMax = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustívelAtual;
        String resultado;

        if (autonomiaAtual < distanciaViagem) {
            resultado = "Você não conseguirá completar a viagem sem precisar abastecer";
        }else {
            resultado = ("Você conseguirá completar a viagem sem precisar abastecer.");
        }

        System.out.println("Autonomia máxima do veículo: " + autonomiaMax + " km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");
        System.out.println(resultado);
    }

}
