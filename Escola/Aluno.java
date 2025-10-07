package Escola;

    class Aluno {
        String nome;
        int matricula;
        double notaFinal;
        
        public Aluno(String nome, int matricula){
            this.nome = nome;
            this.matricula = matricula;
           
        }
    
        void verificarAprovacao(){
            if(notaFinal >= 7.0){
                System.out.println(nome + " está APROVADO(A)!");
    
            } else{
                System.out.println(nome + " está em RECUPERAÇÃO!");
            }
        }
}
