package Lista3;

/* 
    DESCRIÇÃO: Programa que recebe dois valores mostra todos os números entre eles.
    AUTOR: Evelyn
    DATA REFERENTE: 12/05/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L3E2{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int n1, n2;

            //LENDO OS DOIS VALORES
            System.out.print("Digite um número: ");
            n1 = input.nextInt();
            System.out.print("\nDigite outro número maior: ");
            n2 = input.nextInt();

            //INICIANDO O LAÇO FOR 
            for(int cont = n1; cont < n2; cont++){

                //EXIBINDO OS NÚMEROS
                System.out.println(cont);
            }
        }
    }
}