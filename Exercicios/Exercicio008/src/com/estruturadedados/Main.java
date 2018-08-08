package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa que solicita que o usuário digite 10 valores inteiros e
 * armazene esses valores em um vetor. Depois o programa deve solicitar que o
 * usuário digite um número qualquer e o programa deverá exibir quantas vezes esse
 * número ocorre no vetor.
 *
 * Exemplo: (Considere os números 3, 7, 9, 3, 7, 1, 3, 3, 5, 8)
 * o número 7 ocorre 2 vezes
 * o número 3 ocorre 4 vezes
 * o número 2 não ocorre nenhuma vez.
 */
public class Main {

    public static void main(String[] args) {
	    int[] vetor = new int[10];
        Scanner teclado = new Scanner(System.in);

	    for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor no indice [" + i + "] do seu vetor");
            vetor[i] = teclado.nextInt();
        }

        int valor = 0;
        while (valor != -1) {
            System.out.println("Digite o valor procurado e pressione [ Enter ]: ");
            valor = teclado.nextInt();
            int contador = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == valor) {
                    contador ++;
                }
            }

            // Condição ternária
            System.out.println(contador == 0 ? "O número " + valor + " não ocorre nenhuma vez" : "O número " + valor + " ocorre " + contador + " vezes");
        }
    }
}
