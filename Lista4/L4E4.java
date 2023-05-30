package Lista4;

/*
    DESCRIÇÃO: Programa que pega um texto inserido pelo usuário e verifique se a quantidade
    de caracteres desse texto for maior que 10, mostre "você digitou um palavrão!", se não
    mostre "você digitou uma palavrinha"
    AUTOR: Evelyn 
    DATA: 25/05/23
*/

import java.util.Scanner;

public class L4E4 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
        // Lê uma linha de texto digitada pelo usuário e armazena na variável "texto"

        //RECEBE E LÊ O TEXTO INSERIDO
            System.out.println("Digite um texto: ");
            String texto = input.nextLine();

        //DECISÃO PARA DESCOBRIR A QUANTIDADE DE CARACTÉRES
            if (texto.length() > 10) { 
                System.out.println("Você digitou um palavrão!"); 
            } else {
                System.out.println("Você digitou uma palavrinha."); 
            }
        }
    }
}