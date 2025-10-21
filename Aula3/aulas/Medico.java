package Aula3.aulas;



public class Medico {
    private int crm;
    private String nome;
    private Double salario;
    private Double valorDaConsulta;
  
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(Double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico(int crm, String nome, Double salario, Double valorDaConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorDaConsulta = valorDaConsulta;
    
    }

    public void pagamentoDinheiro(double valorPago){
        if(valorPago >= valorDaConsulta){
            double troco = valorPago - valorDaConsulta;
            System.out.println("Pagamento realizado.");
            System.out.println("Troco: R$" + troco);
        } else{
            double faltando = valorDaConsulta - valorPago;
            System.out.println("Pagamento insuficiente, faltam R$: " + faltando);
        }


    }

        public void pagamentoPlano(double valorPago2){
            double valorRecebido = valorDaConsulta * 0.70;
            double troco2 = valorPago2 - valorDaConsulta;
            if(valorPago2 >= valorDaConsulta){
             System.out.println("Pagamento realizado.");
             System.out.println("Troco: R$" + troco2);
             System.out.println("O médico recebeu " + valorRecebido);
            }else{
                double faltando2 = valorDaConsulta - valorPago2;
                System.out.println("Pagamento insuficiente, faltam R$: " + faltando2);
            }

        }



}
