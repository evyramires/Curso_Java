/*
    DESCRIÇÃO: Programa que leia a idade do usuário e mostre a sua faixa etária.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L1E5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        //VARIÁVEIS
        int idade;

        //LENDO A IDADE
        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();

        //DECISÃO ENCADEADA PARA DESCOBRIR A FAIXA ETÁRIA
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        }
    }
}
