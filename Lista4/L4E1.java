package Lista4;

/*
    DESCRIÇÃO: Programa em java que some todos os números cujo quadrado (x²) for divisível por 4.
    AUTOR: Evelyn 
    DATA: 25/05/23
*/

public class L4E1 {
    public static void main(String[] args) {
        
        //LIMITE SUPERIOR PARA OS NÚMEROS A SEREM VERIFICADOS
        int limite = 50;

        //VARIÁVEL PARA ARMAZENAR A SOMA DOS NÚMEROS
        int soma = 0; 

        for (int i = 1; i <= limite; i++) {

            //CALCULE O QUADRADO DO NÚMERO ATUAL
            int quadrado = i * i; 

            if (quadrado % 4 == 0) {

                //SOMA O NÚMERO SE FOR DIVISIVEL POR QUATRO         
                soma += i; 
                System.out.println(i + "² = " + quadrado + " e " + quadrado + "/4 = " + (quadrado / 4) + ", logo, " + i + "² (" + quadrado + ") é divisível por 4.");
            } else {
                System.out.println(i + "² = " + quadrado + " e " + quadrado + "/4 = " + (quadrado / 4) + ", logo, " + i + "² (" + quadrado + ") não é divisível por 4.");
            }
        }

        System.out.println("A soma dos números cujo quadrado é divisível por 4 é: " + soma);
    }
}
