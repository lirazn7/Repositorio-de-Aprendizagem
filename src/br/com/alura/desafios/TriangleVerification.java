package br.com.alura.desafios;

import java.util.Scanner;

public class TriangleVerification {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int sideTri1 = scanner.nextInt();
        System.out.println("Digite o segundo lado: ");
        int sideTri2 = scanner.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int sideTri3 = scanner.nextInt();

        int sideOneTwo = sideTri1 + sideTri2;
        if (sideOneTwo > sideTri3){
            System.out.println("Os lados podem formar um triângulo");
        } else {
            System.out.println("Vai dar não.");
        }
        scanner.close();
    }
}
