package com.estruturadedados;
/**
 * Implementar a versão recursiva e iterativa do algoritmo:
 *
 * Devolve a soma dos elementos de um vetor de inteiros.
 * Ex: Seja um vetor com os valores [7,3,5,2]
 * A soma dos elementos desse vetor é 17
 *
 */
public class Main {

    public static void main(String[] args) {
        int v[] = {7,3,5,2};
                 //0,1,2,3 -- O ultimo indice é 3
        Iterativa iterativa = new Iterativa();
        Recursiva recursiva = new Recursiva();

        System.out.println(iterativa.SomaDoVetor(v));
        System.out.println(recursiva.SomaDoVetor(v, 3));
    }
}
