package Lista6;

/* 
    DESCRIÇÃO: Crie um objeto, de uma classe qualquer, que possua no mínimo 5 atributos e 5 métodos.
    AUTORA: Evelyn
    DATA: 12/06/2023 
*/

public class L6E5 {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    private boolean ligado;

    public L6E5(String marca, String modelo, int ano, double velocidade, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O carro foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O carro foi desligado.");
    }

    public void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println("Acelerando o carro. Velocidade atual: " + velocidade + " km/h");
    }

    public void frear(double decremento) {
        velocidade -= decremento;
        System.out.println("Freando o carro. Velocidade atual: " + velocidade + " km/h");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Carro está ligado? " + (ligado ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        L6E5 meuCarro = new L6E5("Fiat", "Palio", 2022, 0.0, false);

        // Chamando métodos do objeto
        meuCarro.ligar();
        meuCarro.acelerar(60);
        meuCarro.frear(10);
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
    }
}
