package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento;

public class CadastroVeiculos {
    static void main() {
        Veiculo gol = new Veiculo("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Placa: " + gol.getPlaca());
        System.out.println("Ano: " + gol.getAno());
    }

}
