/*
    DESCRIÇÃO: Programa que receba 3 números e calcule a média deles.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

        //VARIÁVEIS
        double n1, n2, n3, media;

        //LENDO OS QUATRO NÚMEROS
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = input.nextDouble();
        
        //FÓRMULA DA MÉDIA
        media = (n1 + n2 + n3) / 3;

        //RESULTADO DA MÉDIA DOS NÚMEROS
        System.out.println("A média dos três números é: " + media);
        }
    }
}
