package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar o método exibeNum10a20, que recebe uma matriz de inteiros e exibe a quantidade
 * de elementos existentes em cada linha, entre 10 e 20.
 *
 * Elaborar o método mediaPares, que recebe uma matriz de inteiros e devolve a média dos
 * elementos pares existentes na matriz.
 *
 * Elaborar o método main que solicita que o usuário digite o número de linhas e o número de
 * colunas da matriz. Depois, solicita que o usuário digite os valores dos elementos dessa
 * matriz. Chame o método exibeNum10a20 e o método mediaPares. Exiba a média dos
 * elementos pares da matriz.
 *
 *
 * @author Cristian Paixão
 */
public class Main {

    public static String exibeNum10a20(int[][] matriz) {
        String resultado = ""; // Criando a string de resultado e inicializando


        for (int i = 0; i < matriz.length; i++) {
            int quantidade = 0;
            resultado += "Encontrados na linha " + (i + 1) + ": ";
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 10 && matriz[i][j] <= 20) {
                    resultado += "Numero " + matriz[i][j] + ", ";
                    quantidade++;
                }
            }
            resultado += "totalizando " + quantidade + " numeros entre 10 e 20. \n";
        }

        return resultado;
    }

    public static String mediaPares(int[][] matriz) {
        int quantidade = 0;
        int total = 0;
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    quantidade++;
                    total += matriz[i][j];
                }
            }
        }

        media = total / quantidade;
        return "A Soma dos " + total + " numeros pares encontrados é " + total + " portanto, sua média é: " + media;
    }

    public static void main(String[] args) {
        int linhas, colunas;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da sua matriz: ");
        linhas = teclado.nextInt();

        System.out.print("Digite a quantidade de colunas da sua matriz: ");
        colunas = teclado.nextInt();

        int[][] matriz = new int[linhas][colunas]; // Criando a matriz

        // Preenchendo os valores na matriz;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para coluna ["+ ( j + 1 ) + "] na linha [" + ( i + 1 )+ "] da matriz: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println(exibeNum10a20(matriz));
        System.out.println(mediaPares(matriz));
    }
}
