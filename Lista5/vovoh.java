/* 
    DESCRIÇÃO: Crie uma classe chamada "Vovoh" que tenha um método construtor.
    AUTORA: Evelyn
    DATA: 07/06/2023 
*/

import java.util.Scanner;

public class vovoh {
    // ATRIBUTOS DA CLASSE
    private String nome;
    private int idade;
    private String hobby;

    // CONSTRUTOR DA CLASSE
    public vovoh(String nome, int idade, String hobby) {
        this.nome = nome;
        this.idade = idade;
        this.hobby = hobby;
    }

    // MÉTODO PARA APRESENTAR A VOVOH
    public void apresentar() {
        System.out.println("Olá, eu sou a vovoh " + nome);
        System.out.println("Tenho " + idade + " anos de idade.");
        System.out.println("Meu hobby é " + hobby + ".");
    }

    // MÉTODO MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SOLICITA OS DADOS
        System.out.print("Digite o nome da vovoh: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da vovoh: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o hobby da vovoh: ");
        String hobby = scanner.nextLine();

        vovoh vovoh = new vovoh(nome, idade, hobby);

        vovoh.apresentar();

        // FECHA O SCANNER
        scanner.close();
    }
}
