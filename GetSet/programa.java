package GetSet;

public class programa {
    public static void main(String[] args) {
        
       Funcionario funcionario  = new Funcionario();
       
       
        System.out.println("Nome: " + funcionario.nome );
        System.out.println("Salário: " + funcionario.salario);
        System.out.println("Inss: " + funcionario.calcularinss());
        System.out.println("Vale Transporte: " + funcionario.valeTransporte());
        System.out.println("Salário liquído: " + funcionario.Salarioliquid());
    }
}
