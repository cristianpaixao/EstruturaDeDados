package com.estruturadedados;

/**
 * Implementar a versão recursiva e iterativa do algoritmo:
 *
 * Dado um número n >=0, devolve a soma dos números 0, 1, 2, ... , n.
 */
public class Main {

    public static void main(String[] args) {
	    Iterativa iterativa = new Iterativa();
	    Recursiva recursiva = new Recursiva();

		System.out.println(iterativa.somaDosNumerosAte(5));
		System.out.println(iterativa.somaDosNumerosAte(0));
		System.out.println(recursiva.somaDosNumerosAte(5));
		System.out.println(recursiva.somaDosNumerosAte(0));
    }
}
