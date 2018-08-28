package com.estruturadedados;

import java.util.Scanner;

/**
 * Elabore um programa em que leia os valores de dois vetores de 4 elementos inteiros cada
 * uma. Crie uma matriz 4x2, sendo que a primeira coluna dessa matriz deve corresponder ao
 * primeiro vetor e a segunda coluna dessa matriz deve corresponder ao segundo vetor.
 * Exiba a matriz.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int[] vetor1 = new int[4];
	    int[] vetor2 = new int[4];
	    Scanner teclado = new Scanner(System.in);

        System.out.println("Preencha o Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Posição ["+i+"]: ");
            vetor1[i] = teclado.nextInt();
        }
        System.out.println("Preencha o Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Posição ["+i+"]: ");
            vetor2[i] = teclado.nextInt();
        }

        // Criando a Matriz
        int[][] matriz = new int[4][2]; // 4 linhas, 2 colunas

        // Preencher coluna com cada vetor
        for (int i = 0; i < matriz[i].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > 0) { // Somebody love
                    matriz[j][i] = vetor2[j];
                    continue;
                }
                matriz[j][i] = vetor1[j];
            }
        }

        // Imprimindo Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
