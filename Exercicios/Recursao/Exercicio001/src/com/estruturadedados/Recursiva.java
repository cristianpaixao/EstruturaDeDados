package com.estruturadedados;

public class Recursiva {
    public int somaDosNumerosAte(int n) {
        if (n == 0) return 0;
        return n + somaDosNumerosAte(n -1);
    }
}
