package com.estruturadedados;

public class Recursiva {
    public int converteEmBinario(int n, int binario, int multiplicador) {
        if (n == 0) {
            return binario;
        }
        binario += (n % 2) * multiplicador;
        multiplicador *= 10;
        return converteEmBinario(n/2, binario, multiplicador);
    }
}