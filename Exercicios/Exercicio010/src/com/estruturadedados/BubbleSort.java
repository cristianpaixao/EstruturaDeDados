package com.estruturadedados;

public class BubbleSort {

    public int[] ordenarVetor(int[] vetor) {
        int auxiliar = 0;
        for(int i = 0; i<vetor.length; i++){
            for(int i2 = 0; i2 < (vetor.length - 1); i2++){
                if(vetor[i2] > vetor[i2 + 1]){
                    auxiliar = vetor[i2];
                    vetor[i2] = vetor[i2+1];
                    vetor[i2+1] = auxiliar;
                }
            }
        }
        return  vetor;
    }
}
