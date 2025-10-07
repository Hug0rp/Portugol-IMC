package sistemaEscolar;

import java.util.Scanner;
public class SistemaEscolar {
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[3];
         Scanner sc = new Scanner(System.in);
         for(int i = 0; i < turma.length; i++){
            turma[i] = new Aluno();
            System.out.printf("Digite o nome do %d Aluno ", i+1);
            turma[i].nome = sc.nextLine();
            System.out.printf("Digite a matricula do %d Aluno ", i+1);
            turma[i].matricula = sc.nextInt();
            System.out.printf("Digite a nota do %d Aluno ", i+1);
            turma[i].notaFinal = sc.nextDouble();
            sc.nextLine();

         }
         for(int i = 0; i < turma.length; i++){
            turma[i].mostrarDados();
            turma[i].verificarAprovacao();
         }
         sc.close();
    }
}
