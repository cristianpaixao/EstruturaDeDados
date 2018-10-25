package com.estruturadedados;

public class Recursiva {
    public int ocorrenciasDe(int x, int[] v, int tamanhoVetor) {
        if (tamanhoVetor == 0) {
            return v[tamanhoVetor] == x ? 1 : 0;
        }
        if (v[tamanhoVetor] == x) return 1 + ocorrenciasDe(x, v, tamanhoVetor - 1);
        return 0 + ocorrenciasDe(x, v, tamanhoVetor -1);
    }
}
