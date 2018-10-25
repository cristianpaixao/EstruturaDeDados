package com.estruturadedados;

public class Recursiva {
    public int SomaDosDigitos(int n, int soma) {
        if (n == 0) return soma;
        soma += n % 10;
        return SomaDosDigitos(n / 10, soma);
    }
}
