public class VerificadorDiaSemana {
    public static void main(String[] args){
        
        int DiaDaSemana = 3;
        switch(DiaDaSemana){
            case 1: 
            System.out.println("Fim de semana.");
            break;
            case 2: 
            System.out.println("Dia útil");
            break;
            case 3: 
            System.out.println("Dia útil.");
            break;
            case 4: 
            System.out.println("Dia útil.");
            break;
            case 5: 
            System.out.println("Dia útil");
            break;
            case 6: 
            System.out.println("Dia útil.");
            break;
            case 7: 
            System.out.println("Fim de semana.");
            break;
            default: 
            System.out.println("Sem resposta");
            break;
        }
    }
}
