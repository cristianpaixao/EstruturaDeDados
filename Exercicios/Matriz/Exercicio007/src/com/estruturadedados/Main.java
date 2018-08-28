package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa em que leia os valores de uma matriz 3x4 de inteiros. Exiba o maior
 * elemento da matriz e sua posição (linha e coluna). Exiba também o menor elemento da
 * matriz e a sua posição (linha e coluna).
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // 3 linhas, 4 colunas
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Linha " + ( i + 1 ));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe o valor da coluna " + j + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Imprimindo a matriz só por convenção
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz["+ i +"]["+ j +"] = " + matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrando o menor e o maior valor
        int menor = matriz[0][0];
        int maior = matriz[0][0];
        String resultadoMaior = null, resultadoMenor = null;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    resultadoMaior = "Maior = matriz["+i+"]["+j+"] = " + maior;
                }

                if (matriz[i][j] <= menor) {
                    menor = matriz[i][j];
                    resultadoMenor = "Menor = matriz["+i+"]["+j+"] = " + menor;
                }
            }
        }

        System.out.println(resultadoMaior);
        System.out.println(resultadoMenor);
    }
}
