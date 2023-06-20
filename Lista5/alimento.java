/* 
    DESCRIÇÃO: Crie uma classe "Alimento" e atribua 10 atributos a ela.
    AUTORA: Evelyn
    DATA: 07/06/2023 
*/

import java.util.Scanner;

public class alimento {
    // ATRIBUTOS
    private String nome;
    private String categoria;
    private int valorNutricional;
    private double preco;
    private boolean vegano;
    private boolean semGluten;
    private boolean organico;
    private String sabor;
    private String dataValidade;
    private int dataFabricacao;

    // CONSTRUTOR
    public alimento(String nome, String categoria, int valorNutricional, double preco, boolean vegano,
                    boolean semGluten, boolean organico, String sabor, String dataValidade,
                    int dataFabricacao) {
        this.nome = nome;
        this.categoria = categoria;
        this.valorNutricional = valorNutricional;
        this.preco = preco;
        this.vegano = vegano;
        this.semGluten = semGluten;
        this.organico = organico;
        this.sabor = sabor;
        this.dataValidade = dataValidade;
        this.dataFabricacao = dataFabricacao;
    }

    // MÉTODO PARA IMPRIMIR AS INFORMAÇÕES DO ALIMENTO
    public void imprimirInformacoes() {
        System.out.println("Informações do Alimento");
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor nutricional: " + valorNutricional);
        System.out.println("Preço: R$" + preco);
        System.out.println("Vegano: " + (vegano ? "Sim" : "Não"));
        System.out.println("Sem Glúten: " + (semGluten ? "Sim" : "Não"));
        System.out.println("Orgânico: " + (organico ? "Sim" : "Não"));
        System.out.println("Sabor: " + sabor);
        System.out.println("Data de Validade: " + dataValidade);
        System.out.println("Data de fabricação: " + dataFabricacao);
    }

    // MÉTODO PARA SOLICITAR OS DADOS DO ALIMENTO PARA O USUÁRIO
    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do alimento: ");
        nome = scanner.nextLine();

        System.out.print("Digite a categoria do alimento: ");
        categoria = scanner.nextLine();

        System.out.print("Digite o valor nutricional do alimento: ");
        valorNutricional = scanner.nextInt();

        System.out.print("Digite o preço do alimento: R$");
        preco = scanner.nextDouble();

        System.out.print("O alimento é vegano? (true/false): ");
        vegano = scanner.nextBoolean();

        System.out.print("O alimento é sem glúten? (true/false): ");
        semGluten = scanner.nextBoolean();

        System.out.print("O alimento é orgânico? (true/false): ");
        organico = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Digite o sabor: ");
        sabor = scanner.nextLine();

        System.out.print("Digite a data de validade do alimento: ");
        dataValidade = scanner.nextLine();

        System.out.print("Digite a data de fabricação do alimento: ");
        dataFabricacao = scanner.nextInt();

        scanner.close();
    }

    // MÉTODO MAIN
    public static void main(String[] args) {
        alimento alimento = new alimento("", "", 0, 0.0, false,
                false, false, "", "", 0);

        alimento.solicitarDados();
        alimento.imprimirInformacoes();
    }
}