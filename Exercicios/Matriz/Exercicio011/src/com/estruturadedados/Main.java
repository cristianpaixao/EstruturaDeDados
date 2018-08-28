package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um método quadradoMagico, que recebe uma matriz de inteiros e devolve true se
 * ela for um quadrado mágico e false caso contrário. Para que seja considerado um quadrado
 * mágico, a soma dos elementos de cada linha deve ser a mesma, e deve ser igual à soma
 * dos elementos de cada coluna,e igual à soma dos elementos de cada diagonal.
 *
 * No main, leia os valores de uma matriz 3x3 e chame o método quadradoMagico para
 * verificar se essa matriz é um quadrado mágico
 *
 * @author Cristian Paixão
 */
public class Main {

    public static String quadradoMagico(int matriz[][]) {
        // (soma l1 + somal2 + soma l3 + soma c1 + soma c2 + soma c3 + soma d1 + soma d2) / (l.length + c.length + 2)
        int somaLinha = 0, somaColuna = 0, somaDiagonal = 0, comparador = 0, resultado;

        // Somando Linhas
        for (int i = 0; i < matriz.length; i++) {
            int temp = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                temp += matriz[i][j];
            }
            if (i == 0) {
                // Obtendo um parametro de comparação
                comparador = temp;
            }
            somaLinha += temp;

        }

        // Somando colunas
        for (int i = 0; i < matriz[0].length; i++) {
            int temp = 0;
            for (int j = 0; j < matriz.length; j++) {
                temp += matriz[j][i];
            }
            somaColuna += temp;
        }

        // Somando diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }

        // Somando diagonal secundária
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][(matriz.length - 1) - i]; // Somebody love de leve
        }

        resultado = (somaLinha + somaColuna + somaDiagonal) / ((matriz.length * 2) + 2);

        System.out.println(resultado);

        return resultado != comparador ? "não é um quadrado mágico!" : "é um quadrado mágico!!!";

    }


    public static void main(String[] args) {
	    int[][] matriz = new int[3][3];
        Scanner teclado = new Scanner(System.in);

        // Preenchendo os valores na matriz;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para coluna ["+ ( j + 1 ) + "] na linha [" + ( i + 1 )+ "] da matriz e pressione [Enter]:");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println(quadradoMagico(matriz));
    }
}
