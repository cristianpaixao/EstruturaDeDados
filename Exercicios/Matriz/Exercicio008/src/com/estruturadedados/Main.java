package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa que solicita que o usuário digite um numero n, que deve ser maior
 * do que 1 e menor do que 6. Em seguida, crie uma matriz n x n de números inteiros e solicite
 * que o usuário digite os valores para preencher a matriz. Em seguida, calcule e exiba a soma
 * dos elementos da diagonal principal da matriz e a soma dos elementos da diagonal
 * secundária da matriz.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int n = 0;

	    while (!(n > 1 && n < 6)) {
            System.out.print("Digite o tamanho de sua matriz (n x n) * Deve ser maior que 1 e menor que 6 *: ");
	        n = teclado.nextInt();
        }

        int[][] matriz = new int[n][n];

	    // Preenchendo a matriz
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da coluna " + j + " na linha " + i + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Somando diagonal principal
	    int resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado += matriz[i][i];
        }
        System.out.println("Resultado diagonal principal = " + resultado);

        // Somando diagonal secundária
        resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado += matriz[i][(n - 1) - i]; // Somebody love de leve
        }
        System.out.println("Resultado diagonal secundaria = " + resultado);

    }
}
