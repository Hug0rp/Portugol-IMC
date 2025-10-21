package GetSet;

public class Funcionario {
    String nome = "Adriano";
    Double salario = 5000.00;
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
 
    public String getNome() {
        return nome;
    }
    public Double getSalario() {
        return salario;
    }
    
  
    public void Salario(String nome, Double salario ){
        this.nome = nome;
        this.salario = salario;
     
    }

    public double calcularinss(){
         return this.salario * 0.11;
    }

    public double valeTransporte(){
        return this.salario * 0.06;
       
    }
    public double Salarioliquid(){
        double inss = calcularinss();
        double valeTransp = valeTransporte();
        return salario - inss - valeTransp;
    }
   

}
