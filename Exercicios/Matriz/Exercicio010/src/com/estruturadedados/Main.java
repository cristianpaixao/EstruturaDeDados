package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa que leia os valores de uma matriz 2x3 de inteiros e exiba a sua
 * matriz transposta.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        Scanner teclado = new Scanner(System.in);

        // Preenchendo os valores na matriz;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para coluna ["+ ( j + 1 ) + "] na linha [" + ( i + 1 )+ "] da matriz e pressione [Enter]:");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Exibindo a matriz de forma normal:
        System.out.println("Exibindo a matriz normalmente: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nExibindo a matriz de forma transposta");
        // Exibindo a matriz de forma transposta:
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println(); // Pulando uma linha marotamente
        }
    }

}
