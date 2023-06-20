/* 
    DESCRIÇÃO: Crie uma classe chamada "Casa" que tenha 10 atributos e 5 métodos.
    AUTORA: Evelyn
    DATA: 07/06/2023 
*/

import java.util.Scanner;

public class casa {
    // ATRIBUTOS
    private String endereco;
    private int numeroQuartos;
    private double area;
    private boolean possuiGaragem;
    private boolean possuiJardim;
    private boolean possuiPiscina;
    private boolean estaAlugada;
    private String corExterna;
    private String corInterna;
    private double valorAluguel;

    // CONSTRUTOR
    public casa(String endereco, int numeroQuartos, double area, boolean possuiGaragem, boolean possuiJardim,
                boolean possuiPiscina, boolean estaAlugada, String corExterna, String corInterna, double valorAluguel) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
        this.possuiGaragem = possuiGaragem;
        this.possuiJardim = possuiJardim;
        this.possuiPiscina = possuiPiscina;
        this.estaAlugada = estaAlugada;
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.valorAluguel = valorAluguel;
    }

    // MÉTODOS
    public void mostrarInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de quartos: " + numeroQuartos);
        System.out.println("Área: " + area + " metros quadrados");
        System.out.println("Possui garagem: " + (possuiGaragem ? "Sim" : "Não"));
        System.out.println("Possui jardim: " + (possuiJardim ? "Sim" : "Não"));
        System.out.println("Possui piscina: " + (possuiPiscina ? "Sim" : "Não"));
        System.out.println("Está alugada: " + (estaAlugada ? "Sim" : "Não"));
        System.out.println("Cor externa: " + corExterna);
        System.out.println("Cor interna: " + corInterna);
        System.out.println("Valor do aluguel: R$" + valorAluguel);
    }

    public void alugarCasa() {
        if (!estaAlugada) {
            estaAlugada = true;
            System.out.println("A casa foi alugada.");
        } else {
            System.out.println("A casa já está alugada.");
        }
    }

    public void desocuparCasa() {
        if (estaAlugada) {
            estaAlugada = false;
            System.out.println("A casa foi desocupada.");
        } else {
            System.out.println("A casa já está desocupada.");
        }
    }

    public void pintarExterna(String novaCor) {
        corExterna = novaCor;
        System.out.println("A cor externa foi alterada para " + novaCor);
    }

    public void pintarInterna(String novaCor) {
        corInterna = novaCor;
        System.out.println("A cor interna foi alterada para " + novaCor);
    }

    // MÉTODO MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // LEITURA DO VALOR DOS ATRIBUTOS
        System.out.println("Digite o endereço da casa:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o número de quartos:");
        int numeroQuartos = scanner.nextInt();

        System.out.println("Digite a área da casa em metros quadrados:");
        double area = scanner.nextDouble();

        System.out.println("A casa possui garagem? (true/false):");
        boolean possuiGaragem = scanner.nextBoolean();

        System.out.println("A casa possui jardim? (true/false):");
        boolean possuiJardim = scanner.nextBoolean();

        System.out.println("A casa possui piscina? (true/false):");
        boolean possuiPiscina = scanner.nextBoolean();

        System.out.println("A casa está alugada? (true/false):");
        boolean estaAlugada = scanner.nextBoolean();

        scanner.nextLine(); 

        System.out.println("Digite a cor externa da casa:");
        String corExterna = scanner.nextLine();

        System.out.println("Digite a cor interna da casa:");
        String corInterna = scanner.nextLine();

        System.out.println("Digite o valor do aluguel da casa:");
        double valorAluguel = scanner.nextDouble();

        // CRIAÇÃO DE INSTÂNCIA DA CLASSE CASA COM OS VALORES FORNECIDOS PELO USUÁRIO
        casa minhaCasa = new casa(endereco, numeroQuartos, area, possuiGaragem, possuiJardim, possuiPiscina, estaAlugada,
                corExterna, corInterna, valorAluguel);

        // EXIBIR AS INFORMAÇÕES DA CASA
        minhaCasa.mostrarInformacoes();

        scanner.close();
    }
}