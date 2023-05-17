package Lista2;

/* 
    DESCRIÇÃO: Programa que receba um valor e mostre a mensagem “Acertou”
    apenas se ele for um número inteiro positivo entre 94 e 456. Do contrário, mostre a
    mensagem “Tente de novo”.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 15/05/2023
*/

import java.util.Scanner;

public class L2E7 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Digite um número inteiro positivo entre 94 e 456: ");
      int numero = input.nextInt();

      if(numero >= 94 && numero <= 456) {
        System.out.println("Acertou!");
      } else {
        System.out.println("Tente de novo");
      }
    }
  }
}
