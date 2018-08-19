package com.estruturadedados;

import java.util.Scanner;

/**
 * Elabore um programa em java que leia os valores de uma matriz 3x3 de inteiros. Crie um
 * vetor de 3 elementos, contendo o total de cada coluna e exiba os valores desse vetor.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int[][] matriz = new int[3][3];
	    int[] vetorResultado = new int[3];
        Scanner teclado = new Scanner(System.in);

	    // Preenchendo as colunas
	    for (int i = 0; i < matriz[0].length; i++) {
            vetorResultado[i] = 0; // Inicializando o vetor com o valor 0 para utilizar += no próximo for sem dar ruim

            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = teclado.nextInt(); // Adicionando valor na matriz

                vetorResultado[i] += matriz[j][i]; // Efetuando a soma já no mesmo for, pra não ficar repetitivo
            }

        }

        // O Exercicio não pede esse cara, mas colocamos para poder visualizar a matriz e comparar com o resultado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < vetorResultado.length; i++) {
            System.out.println("Coluna [" + i + "] = " + vetorResultado[i]);
        }
    }
}
