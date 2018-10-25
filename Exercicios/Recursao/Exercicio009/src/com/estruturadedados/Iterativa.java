package com.estruturadedados;

public class Iterativa {
    public int converteEmBinario(int n) {
        int binario = 0;
        int multiplicador = 1;
        do {
            binario += (n % 2) * multiplicador;
            n = n / 2;
            multiplicador *= 10;
        }while (n != 0);
        return binario;
    }
}
