package com.estruturadedados;

public class Iterativa {
    public int SomaDoVetor(int[] v) {
        int resultado = 0;
        for (int i = 0; i < v.length; i++) {
            resultado += v[i];
        }
        return resultado;
    }
}
