/*
    DESCRIÇÃO: Programa que calcule o perimetro de um circulo, onde o valor do raio será inserido pelo usuário.
    AUTOR: Evelyn
    DATA REFERENTE: 12/04/2023
    ULTIMA ATUALIZAÇÃO: 17/05/2023
*/

//IMPORTANDO O SCANNER
import java.util.Scanner;

public class L1E6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        //VARIÁVEIS
        double raio, perimetro;
        
        //LENDO O VALOR DO RAIO
        System.out.print("Digite o valor do raio: ");
        raio = input.nextDouble();

        //FÓRMULA DO PERÍMETRO DO CIRCULO
        perimetro = 2 * Math.PI * raio;
        
        //RESULTADO DO PERÍMETRO DO CÍRCULO
        System.out.println("O perímetro do círculo é: " + perimetro);
        }
    }
}