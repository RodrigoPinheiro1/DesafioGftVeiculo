package Desafio;

public class main {


    public static void main(String args[]) {


        Veiculo veiculo = new Veiculo();
        descricao Descricao = new descricao();

        Descricao.descricaoVeiculo();


        veiculo.acelerar();
        veiculo.frear();
        veiculo.setpintar("vermelho");
        veiculo.abastecer(20);
        veiculo.ligar(false);
        veiculo.desligado(true);




    }
}
