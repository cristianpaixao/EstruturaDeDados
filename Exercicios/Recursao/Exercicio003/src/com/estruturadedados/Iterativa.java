package com.estruturadedados;

public class Iterativa {
    public int somaPares(int[] v) {
        int resultado = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                resultado += v[i];
            }
        }
        return resultado;
    }
}
