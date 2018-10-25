package com.estruturadedados;

public class Recursiva {
    public int somaPares(int[] v, int tamanhoVetor) {
        if (v[tamanhoVetor] % 2 == 0) {
            if (tamanhoVetor == 0) return v[tamanhoVetor];
            return v[tamanhoVetor] + somaPares(v, tamanhoVetor -1);
        }
        else {
            if (tamanhoVetor != 0) return 0;
            return 0  + somaPares(v, tamanhoVetor -1);
        }
    }
}
