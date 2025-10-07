import java.util.Scanner;
public class Produto {
    String nome;
    int codigo;
    double preco;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto();
        
        System.out.print("Digite o nome do produto: ");;
        produto1.nome = sc.nextLine();

        System.out.println("Digite o nome do código: ");;
        produto1.codigo = sc.nextInt();

        System.out.println("Digite o nome do preço: ");;
        produto1.preco = sc.nextDouble();

        System.out.println("Dados do produto.");
        System.out.println("Nome"+ produto1.nome);
        System.out.println("Código"+ produto1.codigo);
        System.out.println("Preço"+ produto1.preco);
    }
}
