package sistemaEscolar ;

class Aluno {
    String nome;
    int matricula;
    double notaFinal;
   
    void verificarAprovacao(){
        if(notaFinal >= 7.0){
            System.out.println(nome + " está APROVADO(A)!");

        } else{
            System.out.println(nome + " está em RECUPERAÇÃO!");
        }
    }

    void mostrarDados() {
        System.out.printf("Dados do Aluno %s são: %n", nome, matricula, notaFinal);
    }
}
