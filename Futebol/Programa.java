package Futebol;
import  java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeDeFutebol Fogao2013 = new TimeDeFutebol("Fogão2013");

    String nome;
    String posicao;
    int tamanho = 11;
    
    for(int i = 0; i < tamanho; i++ ){
        System.out.printf("Digite o nome do %d jogador: ", i+1);
        nome = sc.nextLine();
        System.out.printf("Digite a posição do %d jogador: ", i+1);
        posicao = sc.nextLine();
        Jogador jogador = new Jogador(nome, posicao);
        Fogao2013.contratarJogador(jogador);


    }
    Fogao2013.exibirEscalação();
    sc.close();
}
}