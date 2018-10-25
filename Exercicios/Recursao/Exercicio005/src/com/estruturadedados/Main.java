package com.estruturadedados;

/**
 * Implementar a versão recursiva e iterativa do algoritmo:
 *
 * Dado um vetor de inteiros e um valor x, conta quantas ocorrências de x há no vetor.
 *
 * Ex: Seja um vetor com os valores [7,3,5,3]
 * O valor 3 ocorre 2 vezes
 * O valor 5 ocorre 1 vez
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] v = {7, 3, 5, 3};

        Iterativa iterativa = new Iterativa();
        Recursiva recursiva = new Recursiva();

        System.out.println("Ocorre " + iterativa.ocorrenciasDe(3, v) + " vezes");
        System.out.println("Ocorre " + iterativa.ocorrenciasDe(5, v) + " vezes");
        System.out.println("Ocorre " + recursiva.ocorrenciasDe(3, v, v.length -1) + " vezes");
        System.out.println("Ocorre " + recursiva.ocorrenciasDe(5, v, v.length -1) + " vezes");
    }
}
