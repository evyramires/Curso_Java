package Lista2;

/* 
    DESCRIÇÃO: Programa pra saber se você pode dirigir.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 16/05/2023
*/

import java.util.Scanner;

public class L2E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        // ENTRADA DE DADOS
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite seu gênero (M/F): ");
        char genero = scanner.next().charAt(0);

        System.out.print("Você tem carteira de motorista? (s/n): ");
        char temCarteira = scanner.next().charAt(0);

        System.out.println("Olá " + nome);

        // DECISÃO ENCADEADA
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");

            if (genero == 'M') {
                System.out.println("Você é do sexo masculino.");
            } else {
                System.out.println("Você é do sexo feminino.");
            }

            if (temCarteira == 's') {
                System.out.println("Você pode dirigir.");
            } else {
                System.out.println("Você não pode dirigir.");
            }
        } else {
            System.out.println("Você não pode dirigir, porque é menor de idade.");
        }

        scanner.close();
    }
}
