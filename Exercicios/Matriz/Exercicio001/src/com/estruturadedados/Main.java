package com.estruturadedados;

import java.util.Scanner;

/**
 * Escreva um programa que leia os valores de uma matriz 2x3 de inteiros e depois
 * exiba os valores em forma de matriz.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int [][] matriz = new int[2][3]; // Criando a matriz
	    Scanner teclado = new Scanner(System.in);

	    // Preenchendo os valores na matriz;
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor para coluna ["+ ( j + 1 ) + "] na linha [" + ( i + 1 )+ "] da matriz e pressione [Enter]:");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Imprimindo os valores em forma de matriz (nesse caso, quase uma tabela, só que mal feita)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Pulando uma linha marotamente
        }
    }
}
