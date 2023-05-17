package Lista2;

/* 
    DESCRIÇÃO: Programa que receba 3 números e que mostre qual número inserido é o maior.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E2 {
  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        //LENDO OS TRÊS NÚMEROS
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = input.nextInt();

        int maior = numero1;

        //DECISÃO ENCADEADA PARA DESCOBRIR O NÚMERO MAIOR
        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        //RESULTADO DO NÚMERO MAIOR
        System.out.println("O maior número é: " + maior);
        }
    }
}