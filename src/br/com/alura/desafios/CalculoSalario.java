package br.com.alura.desafios;

public class CalculoSalario {
    static void main() {
        String nome = "Igor";
        double salario = 2890.0;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento){
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor da IRRF: " + irrf);
        } else if (isento) {
            System.out.println("Contribuinte isendo de IRRF.");
        } else {
            System.out.println("Não será necessário descontar o imposto.");
        }
    }
}
