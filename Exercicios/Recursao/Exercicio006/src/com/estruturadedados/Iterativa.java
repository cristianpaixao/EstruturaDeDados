package com.estruturadedados;

public class Iterativa {
    public int maximoDivisorComum(int dividendo, int divisor) {
        int resto;
        do {
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }while (resto != 0);
        return dividendo;
    }
}
