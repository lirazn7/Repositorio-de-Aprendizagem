package br.com.alura.desafios.desafios2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EventDate {

    // O método main precisa do 'String[] args' para ser reconhecido e executado pela IDE
    public static void main(String[] args) {

        // 1. Definição da data do evento (15 de abril de 2026)
        LocalDate dataPrecadastro = LocalDate.of(2026, 4, 15);
        var scanner = new Scanner(System.in);

        // 2. Criamos o formatador PRIMEIRO, informando o padrão que vamos ler e exibir
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a data de hoje (ex: 12/04/2026): ");

        try {
            // 3. Lemos a entrada e fazemos o parse USANDO o formatador criado acima.
            // Agora o Java entende perfeitamente que o texto está em "dd/MM/yyyy"
            LocalDate resposta = LocalDate.parse(scanner.nextLine(), formatacao);

            // 4. Formatamos as datas de volta para String para deixá-las bonitas no console
            String dataAtualFormatada = resposta.format(formatacao);
            String dataEventoFormatada = dataPrecadastro.format(formatacao);

            // 5. Exibimos os dados
            System.out.println("Data atual: " + dataAtualFormatada);
            System.out.println("Data do evento: " + dataEventoFormatada);

            // 6. Lógica de comparação (Se a data do evento for antes da data que digitamos)
            if (dataPrecadastro.isBefore(resposta)) {
                System.out.println("O evento já ocorreu.");
            } else {
                System.out.println("O evento ainda não ocorreu.");
            }

        } catch (DateTimeParseException e) {
            // Tratamento de erro caso o usuário digite algo fora do formato experado
            System.out.println("Erro: A data não foi compreendida. Por favor, digite exatamente no formato dd/MM/yyyy.");
        } finally {
            // Boa prática: sempre fechar o scanner para liberar a memória
            scanner.close();
        }
    }
}
