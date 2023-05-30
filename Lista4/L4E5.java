package Lista4;

/*
    DESCRIÇÃO: programa que faça uma contagem de 10 a 0 e mostre "fim" quando
    terminada.
    AUTOR: Evelyn 
    DATA: 25/05/23
*/

public class L4E5 {
    public static void main(String[] args) {

        //VARIÁVEL PARA O CONTADOR
        int count = 10; 

        //EXECUTA O LOOP ENQUANTO O CONTADOR FOR MAIOR OU IGUAL A 0
        while (count >= 0) { 

            //EXIBE O VALOR ATUAL DO CONTADOR
            System.out.println(count); 
            count--;
        }

        //EXIBE O FIM DO PROGRAMA
        System.out.println("fim");
    }
}
