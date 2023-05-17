package Lista2;

/* 
    DESCRIÇÃO: Programa que calcule a área de um triângulo e mostre-a.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E3 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      //LENDO A BASE E A ALTURA DO TRIÂNGULO
      System.out.print("Digite a base do triângulo: ");
      double base = input.nextDouble();

      System.out.print("Digite a altura do triângulo: ");
      double altura = input.nextDouble();

      //FÓRMULA DA ÁREA DO TRIÂNGULO
      double area = (base * altura) / 2;

      //RESULTADO DA ÁREA DO TRIÂNGULO
      System.out.println("A área do triângulo é: " + area);
    }
  }
}
