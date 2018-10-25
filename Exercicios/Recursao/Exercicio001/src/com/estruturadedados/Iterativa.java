package com.estruturadedados;

public class Iterativa {
    public int somaDosNumerosAte(int n) {
        int resultado = 0;
        for (int i = 0; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }
}
