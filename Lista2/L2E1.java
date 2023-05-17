package Lista2;

/* 
    DESCRIÇÃO: Programa que recebe o valor inserido pelo usuário e desconte 15%, depois exiba na tela.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E1 {
  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

          //LENDO O VALOR A SER DESCONTADO
          System.out.print("Digite um valor: ");
          double valor = input.nextDouble();

          //FÓRMULA PARA SER FORNECIDO O VALOR COM DESCONTO
          double desconto = valor * 0.15;
          double valorComDesconto = valor - desconto;

          //RESULTADO DO VALOR COM DESCONTO
          System.out.println("Valor original: R$" + valor);
          System.out.println("Valor com desconto: R$" + valorComDesconto);
        }
    }
}

