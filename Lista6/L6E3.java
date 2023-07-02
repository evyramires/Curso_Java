package Lista6;

/* 
    DESCRIÇÃO: Crie um objeto da classe “Casa”, atribua no mínimo 5 valores aos atributos e chame 5 métodos.
    AUTORA: Evelyn
    DATA: 12/06/2023 
*/

public class L6E3 {
    private String endereco;
    private int numeroQuartos;
    private boolean possuiGaragem;

    public L6E3(String endereco, int numeroQuartos, boolean possuiGaragem) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.possuiGaragem = possuiGaragem;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public boolean possuiGaragem() {
        return possuiGaragem;
    }

    public void abrirPorta() {
        System.out.println("A porta da casa foi aberta.");
    }

    public void fecharPorta() {
        System.out.println("A porta da casa foi fechada.");
    }

    public void ligarLuzes() {
        System.out.println("As luzes da casa foram ligadas.");
    }

    public void desligarLuzes() {
        System.out.println("As luzes da casa foram desligadas.");
    }

    public void imprimirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de quartos: " + numeroQuartos);
        System.out.println("Possui garagem: " + (possuiGaragem ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Casa
        L6E3 casa = new L6E3("Rua Principal, 123", 3, true);

        // Atribuindo valores aos atributos
        casa.abrirPorta();
        casa.ligarLuzes();

        // Chamando métodos
        casa.fecharPorta();
        casa.desligarLuzes();
        casa.imprimirInformacoes();
    }
}