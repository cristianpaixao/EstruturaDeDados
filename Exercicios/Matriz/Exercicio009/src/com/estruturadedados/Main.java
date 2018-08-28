package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa que leia os valores de uma matriz 3x4 de inteiros e os valores de
 * uma matriz 4x2 de inteiros. Em seguida, calcule, crie e exiba uma terceira matriz 3x2,
 * contendo o resultado da multiplicação das duas primeiras matrizes.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int[][] m1 = new int[3][4];
        int[][] m2 = new int[4][2];
        int[][] m3 = new int[3][2];
        Scanner teclado = new Scanner(System.in);

        // Preenchendo os valores na matriz 1;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("Digite o valor para coluna ["+ ( j + 1 ) + "] na linha [" + ( i + 1 )+ "] da matriz:");
                m1[i][j] = teclado.nextInt();
            }
        }

        // Preenchendo os valores na matriz 2;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("Digite o valor para coluna ["+ ( j + 1 ) + "] na linha [" + ( i + 1 )+ "] da matriz:");
                m2[i][j] = teclado.nextInt();
            }
        }

        // Multiplicando as matrizes

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                int mult;
                for (int c = 0; c < 4; c++) {
                    m3[i][j] += m1[i][c] * m2[c][j]; // SOMEBODY LOVE ALOPRADO
                    // Basicamente estou aproveitando os contadores já existentes nos "for"
                }
            }
        }

        // Imprimindo os valores em forma de matriz (nesse caso, quase uma tabela, só que mal feita)
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println(); // Pulando uma linha marotamente
        }

    }
}
























