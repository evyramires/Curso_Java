package Lista4;

/*
    DESCRIÇÃO: Programa que recebe três números, e enquanto a soma deles for diferente de
    48 ou 71, continue recebendo três valores infinitamente.
    AUTOR: Evelyn
    DATA: 25/05/23
*/

import java.util.Scanner;

public class L4E2 {
    public static void main(String[] args) {

        //CRIA O SCANNER
        try (Scanner input = new Scanner(System.in)) { 

            //VARIÁVEL
            int soma = 0; 

            //EXECUTA O LOOP ENQUANTO A SOMA NÃO FOR 48 OU 71
            while (soma != 48 && soma != 71) { 
                System.out.println("Digite três números: ");


                //LÊ OS NÚMEROS INSERIDOS   
                int n1 = input.nextInt();    
                int n2 = input.nextInt(); 
                int n3 = input.nextInt(); 

                //CALCULA A SOMA
                soma = n1 + n2 + n3; 
            }
        }
        //EXIBE O RESULTADO
        System.out.println("A soma é igual a 48 ou 71."); 
    }
}
