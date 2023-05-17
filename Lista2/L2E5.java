package Lista2;

/* 
    DESCRIÇÃO: Programa que receba um número e exiba seu sucessor, o  número e o antecessor.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E5 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      //LENDO UM NÚMERO
      System.out.print("Digite um número: ");
      int numero = input.nextInt();

      //ESTRUTURA PARA EXIBIR O SUCESSOR E O ANTECESSOR
      int antecessor = numero - 1;
      int sucessor = numero + 1;

      //EXIBIÇÃO DO ANTECESSOR, ATUAL E SUCESSOR
      System.out.println("O antecessor de " + numero + " é: " + antecessor);
      System.out.println("O número digitado é: " + numero);
      System.out.println("O sucessor de " + numero + " é: " + sucessor);
    }
  }
}