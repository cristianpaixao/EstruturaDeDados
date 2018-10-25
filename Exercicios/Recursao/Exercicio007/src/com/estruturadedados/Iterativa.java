package com.estruturadedados;

public class Iterativa {
    public int maiorValor(int[] v) {
        int maior = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior;
    }
}
