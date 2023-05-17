/*
    DESCRIÇÃO: Programa baseado na cotação atual do dólar que calcule a conversão do número inserido para dólar.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L1E3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        //VARIÁVEIS
        double valorReal, valorDolar, cotacaoDolar;

        //LENDO O VALOR EM REAIS E A COTAÇÃO DO DÓLAR ATUAL
        System.out.print("Digite o valor em reais: R$");
        valorReal = input.nextDouble();

        System.out.print("Digite a cotação do dólar atual: US$");
        cotacaoDolar = input.nextDouble();

        //FORMULA DO VALOR EM DÓLAR
        valorDolar = valorReal / cotacaoDolar;
        
        //RESULTADO DO VALOR EM REAIS CONVERTIDO EM DÓLAR
        System.out.println("O valor em dólares é: US$" + valorDolar);
        }
    }
}