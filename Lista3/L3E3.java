package Lista3;

/* 
    DESCRIÇÃO: Programa que calcule a média de 500 valores inseridos.
    AUTOR: Evelyn
    DATA REFERENTE: 12/05/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L3E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //VARIÁVEIS
        int quant = 500;
        int soma = 0;
        
        //INICIANDO O LAÇO FOR
        for (int i = 1; i <= quant; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();
            soma += valor;
        }
        
        //FÓRMULA DA MÉDIA
        double media = (double) soma / quant;
        
        //EXIBINDO A MÉDIA DOS NÚMEROS INSERIDOS
        System.out.println("A média dos valores inseridos é: " + media);
        
        scanner.close();
    }
}
