public class VerificadoDepermissao {
    public static void main(String[] args){

        double altura = 1.90;
        boolean EstaAcompanhada = true;

        if(altura < 1.60 ){
            System.out.println("Esta pessoa não poderá entrar no brinquedo!!!");
        }
        else if(altura >= 1.60 || EstaAcompanhada){
            System.out.println("Esta pessoa poderá entrar no brinquedo!!!");
        }
        
        
    }
}
