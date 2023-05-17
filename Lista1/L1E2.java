/*
    DESCRIÇÃO: Programa que receba 4 números, calcule ao quadrado de cada um, some todos os valores e mostre o resultado.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/


//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L1E2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        //VARIÁVEIS
        int n1, n2, n3, n4, soma;

        //LENDO OS QUATRO NÚMEROS
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();

        System.out.print("Digite o quarto número: ");
        n4 = input.nextInt();

        //FÓRMULA DA SOMA DOS NÚMEORS AO QUADRADO
        soma = (n1*n1) + (n2*n2) + (n3*n3) + (n4*n4);
        
        //RESULTADO DA SOMA DOS NÚMEROS AO QUADRADO
        System.out.println("A soma dos quadrados dos quatro números é: " + soma);
        }
    }
}
