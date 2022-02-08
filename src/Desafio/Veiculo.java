package Desafio;

public class Veiculo {


    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private Boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;
    private int combustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public Boolean getLigado() {
        return isLigado;
    }

    public void setLigado(Boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void acelerar() {

        this.velocidade += 20;
        System.out.println("aumentou a velocidade em  20 Km");

    }

    public void frear() {

        if (this.velocidade > 0) {
            this.velocidade -= 20;
            System.out.println("diminuiu a velocidade em  20 Km");
        } else {

            System.out.println("o carro está parado");
        }

    }

    public int abastecer(int litrosCombustivel) {

        if (this.litrosCombustivel > 60) {

            System.out.println("o tanque ja está no limite");
        }


        return litrosCombustivel;
    }

    public String setpintar(String cor) {

        this.cor = "Vermelho";

        System.out.println("sua cor é " + this.cor);
        return cor;


    }

    public boolean ligar(boolean isLigado) {

        if (isLigado == false) {

            isLigado = true;
            System.out.println("voce ligou o veiculo");
            return isLigado;

        } else {

            System.out.println("o veiculo ja está ligado");
            return isLigado;


        }


    }

    public boolean desligado(boolean isLigado) {

        if (isLigado == true && this.velocidade <= 0) {

            isLigado = false;

            System.out.println("o veiculo está desligado");
            return isLigado;
        } else {

            System.out.println("o veiculo está em movimento nao pode desligar ");
            return isLigado;
        }

    }


}

