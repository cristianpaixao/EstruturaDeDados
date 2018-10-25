package com.estruturadedados;

public class Iterativa {
    public int ocorrenciasDe(int x, int[] v) {
        int resultado = 0;
        for (int aV : v) {
            if (aV == x) resultado++;
        }
        return resultado;
    }
}
