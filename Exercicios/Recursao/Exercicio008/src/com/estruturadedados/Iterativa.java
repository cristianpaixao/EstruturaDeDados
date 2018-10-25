package com.estruturadedados;

public class Iterativa {
    public int SomaDosDigitos(int n) {
        int soma = 0;
        do {
            soma += n % 10;
            n = n / 10;
        }while (n != 0);
        return soma;
    }
}
