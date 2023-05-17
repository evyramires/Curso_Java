package Lista2;

/* 
    DESCRIÇÃO: Programa que receba dois números e indique se são iguais, o primeiro é maior ou o segundo é maior.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 16/05/2023
*/

import java.util.Scanner;

public class L2E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }

        scanner.close();
    }
}

