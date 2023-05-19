package Lista3;

/* 
    DESCRIÇÃO: Programa que exiba o número digitado n vezes.
    AUTOR: Evelyn
    DATA REFERENTE: 12/05/2023
    ULTIMA ATUALIZAÇÃO: 19/05/2023
*/

import java.util.Scanner;

public class L3D2 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {

            //VARIÁVEL
            int n = 0;

            //CONDIÇÃO PARA O USUÁRIO DIGITAR UM NÚMERO MAIOR QUE 1
            while(n <= 1){

                //LENDO O NÚMERO DIGITADO
                System.out.print("Digite um número maior que 1: ");
                n = input.nextInt();
            }
            //EXIBINDO O NÚMERO N VEZES
            for(int cont = n; cont > 0; cont--){     
                System.out.println(n);
            }
        }
    }
}
