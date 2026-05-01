package br.com.alura.desafios.desafios2.poo.atividade1;

import java.util.ArrayList;
import java.util.List;

public class ControleDeTarefas {
    String descricao;
    boolean concluida;

    void exibirDescricao(){
        if (concluida){
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");

        }
    }

    static void main() {
        ControleDeTarefas t1 = new ControleDeTarefas();
        t1.descricao = "Estudar Javinha";
        t1.concluida = false;

        ControleDeTarefas t2 = new ControleDeTarefas();
        t2.descricao = "Ir pra academia";
        t2.concluida = true;

        List<ControleDeTarefas> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (ControleDeTarefas t : lista) {
            t.exibirDescricao();
        }
    }
}
