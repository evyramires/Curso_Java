/*
    DESCRIÇÃO: Programa que receba 2 números e faça a divisão entre eles.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/


//IMPORTANDO O SCANNER
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        //VARIÁVEIS
        double n1, n2, divisao;
        
        //LENDO OS DOIS NÚMEROS
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = input.nextDouble();

        //FÓRMULA DA DIVISÃO
        divisao = n1 / n2;

        //RESULTADO DA DIVISÃO DOS NÚMEROS
        System.out.println("A divisão é: " + divisao);
        }
    }
}