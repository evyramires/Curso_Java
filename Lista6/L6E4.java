package Lista6;

/* 
    DESCRIÇÃO: Instancie a classe “Vovoh” e use o método construtor.
    AUTORA: Evelyn
    DATA: 12/06/2023 
*/

public class L6E4 {
    // ATRIBUTOS DA CLASSE
    private String nome;
    private int idade;
    private String hobby;

    // MÉTODO MAIN
    public static void main(String[] args) {
        L6E4 vovoh = new L6E4("Creusa", 67, "tricotar");

        System.out.println("Olá, eu sou a vovoh " + vovoh.nome);
        System.out.println("Tenho " + vovoh.idade + " anos de idade.");
        System.out.println("Meu hobby é " + vovoh.hobby + ".");
    }
    
    // CONSTRUTOR DA CLASSE
    public L6E4(String nome, int idade, String hobby) {
        this.nome = nome;
        this.idade = idade;
        this.hobby = hobby;
    }
}