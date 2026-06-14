package br.com.alura.desafios.desafios2.poo.atividade1.encapsulamento.HerancaPoliInterf;

public class PrincipalRelatorio {
    static void main() {
        Relatorio rel = new Relatorio(
                "Relatório 2026",
                "Tudo funcionando conforme esperado."
        );
        rel.imprimir();
    }
}
