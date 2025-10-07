public class ClassificadorDeIdade {
    public static void main(String[] args) {

        int Idade = 80;
        
        if(Idade <= 10){
            System.out.println("Criança!!!");
        }
        else if (Idade <= 17 & Idade >= 11){
            System.out.println("Adolescente!!!");
        }
        else if (Idade <= 59 & Idade >= 18 ){
            System.out.println("Adulto!!!");
        }
        else{
            System.out.println("Idoso!!!");
          }
        }
    }
    

