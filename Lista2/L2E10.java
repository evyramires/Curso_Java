package Lista2;

/* 
    DESCRIÇÃO: Programa que recebe um número e mostre se ele é par ou ímpar.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            //VARIÁVEL
            int numero;

            //LENDO UM NÚMERO INTEIRO
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();

            //DECISÃO ENCADEADA PARA SABER SE O NÚMERO É PAR OU ÍMPAR
            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        }
    }
}
