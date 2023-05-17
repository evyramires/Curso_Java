package Lista2;

/* 
    DESCRIÇÃO: Programa que receba a quantidade de picolés de Kiwi, Laranja e Romã
    a ser comprado e calcule o valor total da compra e mostre-a.
    AUTOR: Evelyn
    DATA REFERENTE: 19/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L2E6 {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double precoKiwi = 3.20;
      double precoLaranja = 2.39;
      double precoRoma = 7.99;

      //LENDO A QUANTIDADE DE CADA SABOR DE PICOLÉ A SER COMPRADO
      System.out.print("Quantidade de picolés de Kiwi a ser comprado: ");
      int quantidadeKiwi = input.nextInt();

      System.out.print("Quantidade de picolés de Laranja a ser comprado: ");
      int quantidadeLaranja = input.nextInt();

      System.out.print("Quantidade de picolés de Romã a ser comprado: ");
      int quantidadeRoma = input.nextInt();

      //FÓRMULA PARA A COMPRA DE PICOLÉS
      double total = (quantidadeKiwi * precoKiwi) + (quantidadeLaranja * precoLaranja) + (quantidadeRoma * precoRoma);

      //EXIBIÇÃO DO VALOR TOTAL DE PICOLÉS COMPRADOS
      System.out.println("O valor total da compra é: R$ " + total);
    }
  }
}