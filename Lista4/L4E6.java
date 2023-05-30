package Lista4;

/*
    DESCRIÇÃO: Programa que some 10 valores inteiros positivos (ignore valores negativos, caso
    o usuário os insira) e mostre sua raiz quadrada.
    AUTOR: Evelyn 
    DATA: 25/05/23
*/

import java.util.Scanner;

public class L4E6 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) { 
            
            //VARIAVÉIS
            int soma = 0; 
            int cont = 0; 

            //RECEBE OS NÚMEROS
            System.out.println("Digite 10 valores inteiros positivos:");

            //EXECUTA O LOOP ENQUANTO FOR MENOR QUE 0
            while (cont < 10) { 
                
                //LÊ O VALOR DIGITADO PELO USUÁRIO
                int valor = input.nextInt(); 

          
                if (valor > 0) {   
                    soma += valor; 
                    cont++;
                } else {
                    //EXIBE UMA MENSAGEM QUE VALOR FOI NEGADO
                    System.out.println("Valor negativo ignorado."); 
                }
            }

            //CALCULA A RAIZ QUADRADA DA SOMA
            double somaq = Math.sqrt(soma);

            //EXIBE A SOMA
            System.out.println("A soma dos valores é: " + soma);

            //EXIBE A RAIZ QUADRADA DA SOMA
            System.out.println("A raiz quadrada da soma é: " + somaq);
        }
    }
}