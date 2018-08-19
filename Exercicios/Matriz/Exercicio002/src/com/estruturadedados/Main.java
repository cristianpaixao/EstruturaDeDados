package com.estruturadedados;

import java.util.Scanner;

/**
 * Elabore um método exibeMatriz, que recebe uma matriz de inteiros e exibe seus valores
 * em forma de matriz. Escreva no main o código que leia os valores de duas matrizes 2x3 de
 * inteiros. Depois calcule a soma dessas duas matrizes, armazenando a soma em uma terceira
 * matriz e exiba os valores dessa terceira matriz (chame o método exibeMatriz para exibir
 * a matriz).
 *
 * @author Cristian Paixão
 */
public class Main {

    public static String exibeMatriz(int[][] matriz) {
        String resultado = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado += matriz[i][j] + "\t";
            }
            resultado += "\n"; // Pulando aquela linha marota
        }
        return resultado;
    }

    // Esse eu fiz só pela preguiça de preencher
    public static int[][] preencheMatriz() {
        int[][] matriz = new int[2][3];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da coluna [" + ( j + 1 ) + "] da linha [" + ( i + 1 ) + "] e pressione [Enter]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        return matriz;
    }

    // Esse é pra padronizar mais ou menos (pensando bem eu poderia ter feito esses métodos em uma classe diferente)
    public static int[][] somaMatrizes(int [][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[2][3];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Criando as matrizes
	    int[][] matriz1;
        int[][] matriz2;
        int[][] matriz3;

        // Preenchendo as duas matrizes que serão somadas
        System.out.println("Preenchendo a matriz 1");
        matriz1 = preencheMatriz();

        System.out.println("Preenchendo a matriz 2");
        matriz2 = preencheMatriz();

        // Somando Matriz
        matriz3 = somaMatrizes(matriz1, matriz2);

        // Exibindo matriz com as somas
        System.out.println(exibeMatriz(matriz3));


    }

}
