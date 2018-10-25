package com.estruturadedados;

/**
 * Devolve a soma dos dígitos de um número inteiro.
 *  Ex: Número 132 - Soma dos dígitos é 6
 *      Número 3417 - Soma dos dígitos é 15
 *
 * Dica: Para se separar os dígitos de um número, basta obter o resto do número por
 * 10. Por exemplo, 132 divido por 10 da 13 e o resto 2. Depois pega-se o
 * resultado da divisão e repete-se o procedimento até que o resultado seja zero:
 * 13 dividido por 10 dá 1 e o resto 3. Novamente, 1 dividido por 10 da 0 e resto 1.
 */
public class Main {

    public static void main(String[] args) {
        Iterativa iterativa = new Iterativa();
        Recursiva recursiva = new Recursiva();
        System.out.println(iterativa.SomaDosDigitos(132));
        System.out.println(recursiva.SomaDosDigitos(132, 0));
    }
}
