package Garagem;

public class veiculo {
    String placa;
    String tipo;
    double valor;

    public double calculaIPVA() {
        if(tipo.equals("Flex")|| tipo.equals("Gasolina")){
            return valor * 0.04;
        }else{
            return valor * 0.015;
        }
    }
}
