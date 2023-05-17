package Lista2;

/* 
    DESCRIÇÃO: Programa que receba dois valores e troque-os.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E4 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      //LENDO VALOR A E VALOR B
      System.out.print("Digite o valor A: ");
      int valorA = input.nextInt();

      System.out.print("Digite o valor B: ");
      int valorB = input.nextInt();

      //TROCA DOS VALORES
      int temp = valorA;
      valorA = valorB;
      valorB = temp;

      //RESULTADO DOS VALORES TROCADOS
      System.out.println("Valor A após a troca: " + valorA);
      System.out.println("Valor B após a troca: " + valorB);
    }
  }
}