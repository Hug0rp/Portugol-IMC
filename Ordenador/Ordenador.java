package Ordenador;

public class Ordenador {
    public static void bubbleSort(int[] vetor){
        int n =vetor.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.printf("Posição j: %d \n", i);
                    System.out.printf("Item na posição %d é %d e item na posição %d é %d\n ", j, vetor[j], j+1, vetor[j+1]);
                     if(vetor[j]>vetor[j+1]){
                        int temp = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = temp;
                        System.out.printf("Item na posição %d é %d e item na posição %d é %d\n ", j, vetor[j], j+1, vetor[j+1]);

                     }

            }
        }
    }


    public static void selectionSort(int[] vetor){
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++){
            int indiceMenor = i;
            for(int j = i + 1; j < n; j++ ){
                if(vetor[j] < vetor[indiceMenor]){
                    indiceMenor = j;
                }
                int temp = vetor[indiceMenor];
                vetor[indiceMenor] = vetor[i];
                vetor[i] = temp;
            }
        }
    }
    

    public static void insertionSort(int[]vetor ){
        for(int i = 1; i < vetor.length; i++){
            int chave = vetor[i];
            System.out.println("Essa é a chave " + chave);
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave){
                vetor[j + 1] = vetor [j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

}