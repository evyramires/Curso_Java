package Lista4;

/*
    DESCRIÇÃO: Programa que gera 50 números inteiros e some eles numa variável. Depois,
    faça o mesmo com 50 números reais aleatórios. Após, mostre as duas somas e aponte
    qual foi a maior.
    AUTOR: Evelyn
    DATA: 25/05/23
*/

//IMPORTANDO O SCANNER
import java.util.Random;

public class L4E3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ninteiro = new int[50];
        double[] dnumero = new double[50];
        int somaInt = 0;
        double somaDouble = 0.0;

        System.out.println("Números inteiros gerados:");
        for (int i = 0; i < ninteiro.length; i++) {

            //GERA UM NÚMERO INTEIRO ALEATÓRIO ENTRE 0 E 99
            ninteiro[i] = random.nextInt(100); 
            System.out.print(ninteiro[i] + " ");
            somaInt += ninteiro[i];
        }

        System.out.println("\nNúmeros reais gerados:");
        for (int i = 0; i < dnumero.length; i++) {

            //GERA UM NÚMERO REAL ALEATÓRIO  
            dnumero[i] = random.nextDouble() * 100; 
            System.out.print(dnumero[i] + " ");
            somaDouble += dnumero[i];
        }

        System.out.println("\n\nA soma dos 50 números inteiros aleatórios é: " + somaInt);
        System.out.println("A soma dos 50 números reais aleatórios é: " + somaDouble);

        //DECISÃO PARA A EXIBIÇÃO NA TELA
        if (somaInt > somaDouble) {
            System.out.println("\nA soma dos números inteiros é maior.");
        } else if (somaDouble > somaInt) {
            System.out.println("\nA soma dos números reais é maior.");
        } else {
            System.out.println("\nAs duas somas são iguais.");
        }
    }
}
