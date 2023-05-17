/*
    DESCRIÇÃO: Programa que receba um nome e uma idade e mostre na tela.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        
        //LENDO O NOME E A IDADE
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        //NOME E IDADE SENDO MOSTRADO NA TELA
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        }
    }
}
