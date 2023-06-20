/* 
    DESCRIÇÃO: Crie uma classe chamada "Cinto" que tenha 5 métodos.
    AUTORA: Evelyn
    DATA: 07/06/2023 
*/

// IMPORTANDO O SCANNER
import java.util.Scanner;

public class cinto {
    // MÉTODOS
    public void apertarCinto() {
        System.out.println("Cinto apertado.");
    }
    public void afrouxarCinto() {
        System.out.println("Cinto afrouxado.");
    }
    public void desengatarCinto() {
        System.out.println("Cinto desengatado.");
    }
    public void ajustarAlturaCinto() {
        System.out.println("Altura do cinto ajustada.");
    }
    public void verificarCintoApertado() {
        System.out.println("O cinto está apertado? (Sim/Não)");
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("O cinto está apertado.");
        } else {
            System.out.println("O cinto não está apertado.");
        }
        scanner.close();
    }

    // MÉTODO PRINCIPAL
    public static void main(String[] args) {
        cinto cinto = new cinto();

        System.out.println("Escolha uma opção:");
        System.out.println("1. Apertar o cinto");
        System.out.println("2. Afrouxar o cinto");
        System.out.println("3. Desengatar o cinto");
        System.out.println("4. Ajustar a altura do cinto");
        System.out.println("5. Verificar se o cinto está apertado");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                cinto.apertarCinto();
                break;
            case 2:
                cinto.afrouxarCinto();
                break;
            case 3:
                cinto.desengatarCinto();
                break;
            case 4:
                cinto.ajustarAlturaCinto();
                break;
            case 5:
                cinto.verificarCintoApertado();
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
