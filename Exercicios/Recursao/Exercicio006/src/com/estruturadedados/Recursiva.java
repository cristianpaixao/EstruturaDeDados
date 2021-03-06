package com.estruturadedados;
/**
 * Implementar a versão iterativa e recursiva do algoritmo de Euclides para calcular o
 * maior divisor comum entre 2 números naturais. Esse algoritmo consiste em dividir
 * os 2 números naturais um pelo outro, depois dividir o divisor por zero. O maior divisor
 * Comum será o último divisor.
 *
 *  Ex: Qual é o máximo divisor comum entre 90 e 54?
 *  Divide-se 90 por 54, obtendo-se quociente 1 e resto 36.
 *  Divide-se 54 por 36, obtendo-se quociente 1 e resto 18.
 *  Divide-se 36 por 18, obtendo-se quociente 2 e resto 0.
 *  Portanto, o máximo divisor comum é 18.
 */
public class Recursiva {
    public int maximoDivisorComum(int dividendo, int divisor) {
        int resto = dividendo % divisor;
        if (resto == 0) {
            return divisor;
        }
        dividendo = divisor;
        divisor = resto;
        return maximoDivisorComum(dividendo, divisor);
    }
}
