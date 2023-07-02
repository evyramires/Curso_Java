package Lista6;

/* 
    DESCRIÇÃO: Instancie a classe “Alimentos” e insira valores aos atributos. Depois, mostre-os no terminal.
    AUTORA: Evelyn
    DATA: 12/06/2023 
*/

public class L6E1 {
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
    private String dataFabricacao;

    // MÉTODO MAIN
    public static void main(String[] args) {
        L6E1 alimento = new L6E1("Uva", "Fruta", 13, 4.0, true,
                true, false, "Azedo/Doce", "12/05", "13/04");
                
        System.out.println("Informações do Alimento");
        System.out.println("Nome: " + alimento.nome);
        System.out.println("Categoria: " + alimento.categoria);
        System.out.println("Valor nutricional: " + alimento.valorNutricional);
        System.out.println("Preço: R$" + alimento.preco);
        System.out.println("Vegano: " + (alimento.vegano ? "Sim" : "Não"));
        System.out.println("Sem Glúten: " + (alimento.semGluten ? "Sim" : "Não"));
        System.out.println("Orgânico: " + (alimento.organico ? "Sim" : "Não"));
        System.out.println("Sabor: " + alimento.sabor);
        System.out.println("Data de Validade: " + alimento.dataValidade);
        System.out.println("Data de fabricação: " + alimento.dataFabricacao);
    }
    
    // CONSTRUTOR
    public L6E1(String nome, String categoria, int valorNutricional, double preco, boolean vegano,
                    boolean semGluten, boolean organico, String sabor, String dataValidade,
                    String dataFabricacao) {
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
}