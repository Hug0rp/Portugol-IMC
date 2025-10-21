package loja;
import java.util.Scanner;
public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "";

        do{
            System.out.println("Produto: ");
            String desc = sc.nextLine();
            System.out.println("valor: ");
            double valor = sc.nextDouble();
            System.out.println("Quantidade: ");
            int qtd = sc.nextInt();

            Produto produto = new Produto(desc) 
        }while(!continuar.equalsIgnoreCase("S"));
    }
}
