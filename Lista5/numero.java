/* 
    DESCRIÇÃO: Crie uma classe chamada "Cinto" que tenha 5 métodos.
    AUTORA: Evelyn
    DATA: 07/06/2023 
*/

import java.util.Scanner;

public class numero {
    // ATRIBUTOS DA CLASSE
    private int numero1;
    private int numero2;
    private String texto1;
    private String texto2;
    private boolean condicao;
    private double valor1;
    private double valor2;
    private char caractere;
    private String[] lista;
    private int tamanhoLista;

    // CONSTRUTOR DE CLASSE
    public numero(int numero1, int numero2, String texto1, String texto2, boolean condicao,
                       double valor1, double valor2, char caractere, String[] lista, int tamanhoLista) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.condicao = condicao;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.caractere = caractere;
        this.lista = lista;
        this.tamanhoLista = tamanhoLista;
    }

    // SOMA DOS NÚMEROS
    public int somarNumeros() {
        return numero1 + numero2;
    }

    //CONCATENAR O NÚMERO
    public String concatenarTextos() {
        return texto1 + texto2;
    }

    // VERIFICA A CONDIÇÃO
    public boolean verificarCondicao() {
        return condicao;
    }

    // CALCULAR MÉDIA
    public double calcularMediaValores() {
        return (valor1 + valor2) / 2;
    }

    // EXIBIR O CARACTERE
    public void exibirCaractere() {
        System.out.println("O caractere é: " + caractere);
    }

    // EXIBIR LISTA DE ALIMENTOS
    public void exibirLista() {
        System.out.println("Elementos da lista:");
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println(lista[i]);
        }
    }

    // VEFIRICAR SE O TEXTO1 CONTÉM O TEXTO2
    public boolean verificarTextoContido() {
        return texto1.contains(texto2);
    }

    // CALCULAR POTÊNCIA
    public double calcularPotencia() {
        return Math.pow(numero1, numero2);
    }

    // LER OS VALORES
    public void lerValoresTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de numero1: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o valor de numero2: ");
        numero2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o valor de texto1: ");
        texto1 = scanner.nextLine();

        System.out.print("Digite o valor de texto2: ");
        texto2 = scanner.nextLine();

        System.out.print("Digite o valor de condicao (true/false): ");
        condicao = scanner.nextBoolean();

        System.out.print("Digite o valor de valor1: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o valor de valor2: ");
        valor2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o caractere: ");
        caractere = scanner.nextLine().charAt(0);

        System.out.print("Digite o tamanho da lista: ");
        tamanhoLista = scanner.nextInt();
        scanner.nextLine();

        lista = new String[tamanhoLista];
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " da lista: ");
            lista[i] = scanner.nextLine();
        }

        scanner.close();
    }

    // MÉTODO MAIN
    public static void main(String[] args) {
        numero minhaClasse = new numero(0, 0, "", "", false, 0.0, 0.0, '\0', new String[0], 0);

        minhaClasse.lerValoresTeclado();

        System.out.println("Soma dos números: " + minhaClasse.somarNumeros());
        System.out.println("Concatenação dos textos: " + minhaClasse.concatenarTextos());
        System.out.println("Condição: " + minhaClasse.verificarCondicao());
        System.out.println("Média dos valores: " + minhaClasse.calcularMediaValores());
        minhaClasse.exibirCaractere();
        minhaClasse.exibirLista();
        System.out.println("Texto1 contém Texto2? " + minhaClasse.verificarTextoContido());
        System.out.println("Potência: " + minhaClasse.calcularPotencia());
    }
}
