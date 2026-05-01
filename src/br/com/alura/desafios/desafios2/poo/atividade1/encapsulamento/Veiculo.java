package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class Veiculo {
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
