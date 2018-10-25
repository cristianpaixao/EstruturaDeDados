package com.estruturadedados;

/**
 * Implementar a versão iterativa e recursiva do algoritmo que, dado um vetor de n
 * elementos, devolve o maior elemento do vetor.
 */
public class Main {

    public static void main(String[] args) {
	    int[] v = {4,0,0,2,8,9,2,2};

	    Iterativa iterativa = new Iterativa();
	    Recursiva recursiva = new Recursiva();
        System.out.println(iterativa.maiorValor(v));
        System.out.println(recursiva.maiorValor(v, 0, 0));
    }
}
