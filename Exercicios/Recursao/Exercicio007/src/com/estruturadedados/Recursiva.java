package com.estruturadedados;

public class Recursiva {
    public int maiorValor(int[] v, int i, int maior) {
        if (i >= v.length) return maior;
        if (v[i] > maior) maior = v[i];
        return maiorValor(v, i + 1, maior);
    }
}
