package Lista3;

/* 
    DESCRIÇÃO: Programa que exiba todos os números de 0 á 200.
    AUTOR: Evelyn
    DATA REFERENTE: 12/05/2023
    ULTIMA ATUALIZAÇÃO: 19/05/2023
*/

public class L3D1 {
    public static void main(String[] args){

        //VARIÁVEL
        int cont1 = 0;

        //iNICIANDO O LAÇO FOR
        for(int cont = 0; cont < 1000; cont++){
            if(cont1 == 10){
                System.out.println("O número "+cont+" é múltiplo de 10");
                cont1 = 0;
            }else{
                System.out.println(cont);
            }

            //CONTADOR
            cont1++;
        }
    }
}