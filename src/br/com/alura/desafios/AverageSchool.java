package br.com.alura.desafios;

import java.util.Scanner;

public class AverageSchool {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //inserção dos valores
        System.out.println("Digite a sua primeira nota:");
        double nota1 = sc.nextInt();
        System.out.println("Digite a sua segunda nota:");
        double nota2 = sc.nextInt();
        System.out.println("Digite a sua terceira nota:");
        double nota3 = sc.nextInt();

        //cálculo da média entre as notas
        double media = (nota1 + nota2 + nota3) / 3.0;

        //uso das condicionais IF e ELSE para saber a média e lançar a resposta ao usuário
        if (media >= 7.0){
            System.out.println("Você teve média de " + media + " e " +
                    "foi aprovado, Parabéns seu porrinha" );
        } else if (media >= 5.0) {
            System.out.println("Você teve média de " + media + " e " +
                    "está de recuperação. Tu é beta mermo né?");
        } else {
            System.out.println("Mano, média de " + media + ". Sério?? Aposenta mlk.");
        }

        sc.close();
    }

}
