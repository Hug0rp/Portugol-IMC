package Futebol;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador[] jogadores = new Jogador[11]; 
    int vagasOcupadas = 0;
    
    
    public TimeDeFutebol(String jogadores) {
     
    }
    public void contratarJogador(String nomeDotime){
        this.nomeDoTime = nomeDotime;

    }

    public void contratarJogador(Jogador novJogador){
        if(vagasOcupadas < jogadores.length){
            jogadores[vagasOcupadas] = novJogador;
            vagasOcupadas++;
            System.out.println("O jogador " + jogadores[vagasOcupadas].nome + " foi contratado.");
        }else{
            System.out.println("Não há mais vagas no time.");

        }

    }
    public void exibirEscalação(){
        System.out.printf("Escalação do time");
        for(int i = 0; i < vagasOcupadas; i++){
            System.out.printf("%d - Nome: %s | Posição: %s \n", i+1, jogadores[i].nome, jogadores[i].posicao);
        }
    }
}





