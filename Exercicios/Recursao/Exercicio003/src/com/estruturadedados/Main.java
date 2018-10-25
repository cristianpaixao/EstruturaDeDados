package com.estruturadedados;
/**
 * Implementar a versão recursiva e iterativa do algoritmo:
 *
 * Devolve a soma dos elementos pares de um vetor de inteiros.
 * Ex: Seja um vetor com os valores [7,3,5,2]
 * A soma dos elementos desse vetor é 2
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] v = {7,3,5,2};
        Iterativa iterativa = new Iterativa();
        Recursiva recursiva = new Recursiva();

        System.out.println(iterativa.somaPares(v));
        System.out.println(recursiva.somaPares(v, v.length -1));
    }
}
