import javax.swing.JOptionPane;

public class BoletimEscolar {
    public static void main(String[] args) {
        double[][] turma = new double[3][4];
        double[] medias = new double[3];
        double soma = 0;
        JOptionPane.showMessageDialog(null, "Boletim escolar! Digite a seguir as notas bimestrais dos alunos. ");
        for(int i =0; i < turma.length; i++){
            for(int j=0; j < turma[i].length; j++){
                String mensagem = String.format("Digite a %dª nota do Aluno %d", j+1, i+1);
                turma[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, mensagem));
                soma += turma[i][j];
            }
            medias[i] = soma/turma[i].length;
            soma = 0;
        }
        String mensagemFinal = "Resultado final da turma\n";
        for(int i = 0; i < medias.length; i++){
            mensagemFinal +=  i+1 + "º Aluno - média: " + String.format("%.2f",medias[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, mensagemFinal);
    }
}
