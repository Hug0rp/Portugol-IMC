package buscaObjeto;

public class BuscaObjeto {

    public static void selectionSortPorNome(item[] vetor){
        int n = vetor.length;
        for(int i = 0; i<n -1; i++){
            int indiceMenor = i;
            for(int j = i+1; j<n; j++){
                if(vetor[j].nome.compareToIgnoreCase(vetor[indiceMenor].nome) < 0){
                    indiceMenor = j;
                }
            }
            item temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
       
    }


    }

