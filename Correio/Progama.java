package Correio;

public class Progama {
    public static void main(String[] args) {
        Endereço endDoJoao = new Endereço();
        endDoJoao.rua = "Rua das Flores";

        endDoJoao.numero = 123;

        endDoJoao.cep = "25688-000";

        endDoJoao.cidade = "Petrópolis";

        Pessoa joao = new Pessoa();
        joao.nome = "João Carlos";
        joao.cpf = "111.222.333-44";

        joao.endereco = endDoJoao;

        System.out.println("O "+ joao.nome+ " mora na Cidade de " + joao.endereco.cidade);

    }
}
