package br.com.alura.desafios;

import java.util.Scanner;

public class Blood {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idadeDoador = scanner.nextInt();
        System.out.println("Digite o peso do doador: ");
        int pesoDoador = scanner.nextInt();

        if (idadeDoador < 18) {
            System.out.println("O doador não é compatível.\nMotivo: Deve ter" +
                    " entre 18 e 65 anos.");
        } else if (idadeDoador > 65) {
            System.out.println("O doador não é compatível.\nMotivo:" +
                    " Deve ter entre 18 e 65 anos.");
        } else if (pesoDoador < 50) {
            System.out.println("O doador não é compatível.\nMotivo:" +
                    " Deve pesar mais que 50kg.");
        }else {
            System.out.println("O doador é compatível.");
        }
    }
}
