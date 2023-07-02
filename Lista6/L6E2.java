package Lista6;

/* 
    DESCRIÇÃO: Crie um objeto da classe “Cinto” e chame-os
    AUTORA: Evelyn
    DATA: 12/06/2023 
*/

public class L6E2 {
    private String material;
    private int comprimento;

    public L6E2(String material, int comprimento) {
        this.material = material;
        this.comprimento = comprimento;
    }

    public String getMaterial() {
        return material;
    }

    public int getComprimento() {
        return comprimento;
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Cinto
        L6E2 cinto = new L6E2("Couro", 100);

        // Obtendo os valores dos atributos e mostrando-os
        String material = cinto.getMaterial();
        int comprimento = cinto.getComprimento();

        System.out.println("Material: " + material);
        System.out.println("Comprimento: " + comprimento);
    }
}
