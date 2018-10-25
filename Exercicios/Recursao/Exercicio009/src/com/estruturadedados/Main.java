package com.estruturadedados;

/**
 * Dado um número inteiro, devolve sua representação em binário.
 *
 *  Ex: Número 9 - representação em binário: 1001
 *      Número 12 - representação em binário: 1100
 *      Número 32 - representação em binário: 100000
 *
 *  Dica: Divida o número por 2, e depois, o resultado da divisão por 2
 *        sucessivamente, até que o resultado seja zero. Os restos de cada divisão
 *        formam a representação em binário.
 *        Por exemplo, 12 dividido por 2, da 6 e resto zero.
 *        6 dividido por 2 dá 3 e resto zero.
 *        3 dividido por 2 dá 1 e resto um.
 *        1 dividido por 2 dá 0 e resto um.
 *
 *        Representação binária de 12 = 1100
 */
public class Main {

    public static void main(String[] args) {
	    Iterativa iterativa = new Iterativa();
	    Recursiva recursiva = new Recursiva();

        System.out.println(iterativa.converteEmBinario(12));
        System.out.println(recursiva.converteEmBinario(12, 0, 1));
        System.out.println(iterativa.converteEmBinario(9));
        System.out.println(recursiva.converteEmBinario(9, 0, 1));
        System.out.println(iterativa.converteEmBinario(32));
        System.out.println(recursiva.converteEmBinario(32, 0, 1));
    }
}
