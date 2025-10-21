package Garagem;

public class Testaveiculo {
    public static void main(String[] args) {
        veiculo veiculo = new veiculo();
        veiculo.placa = "KYZ9034";
        veiculo.tipo = "Flex";
        veiculo.valor = 20000;

        System.out.println("O valor do IPVA é:" + veiculo.calculaIPVA());
    }
}
