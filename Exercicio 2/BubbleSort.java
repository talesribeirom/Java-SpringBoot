import java.util.*;

public class BubbleSort {

    //Método que irá ordernar o vetor
    void ordernar(int vetor[])
    {
        //Tamanho do vetor
        int tam = vetor.length;

        //Percorrimento
        for (int i = 0; i < tam-1; i++)
            for (int j = 0; j < tam-i-1; j++)
                if (vetor[j] > vetor[j+1])
                {
                    //Swap
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
    }

    void imprimeVetor(int vetor[]){
        int tam = vetor.length;
        
        System.out.print("Vetor ordenado: ");
        for(int i = 0; i < tam; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }


}
