package com.estruturadedados;

public class Recursiva {
    public int SomaDoVetor(int[] v, int ultimoIndice) {
        if (ultimoIndice == 0) return  v[0];
        return v[ultimoIndice] += SomaDoVetor(v , ultimoIndice -1);
    }
}
