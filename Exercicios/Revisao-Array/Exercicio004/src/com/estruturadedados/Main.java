package com.estruturadedados;

import java.util.Scanner;

/**
 * Escreva um programa que leia 7 números e armazene-os em um vetor. Depois o
 * programa deve percorrer o vetor imprimindo os números na ordem em que foram
 * inseridos. E depois, deve percorrer o vetor de trás para frente, imprimindo os
 * números na ordem inversa em que foram insediros (dica: utilize o for ao contrário).
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int[] vetorzao = new int[7];
	    Scanner teclado = new Scanner(System.in);
	    for (int i = 0; i < vetorzao.length; i++) {
            System.out.println("Informe o número para o índice " + i + " do vetor e pressione [Enter]");
            vetorzao[i] = teclado.nextInt();
        }
        System.out.println("Imprimindo em ordem: ");
        for (int i = 0; i < vetorzao.length; i++) {
            System.out.println("v[" + i + "] = " + vetorzao[i]);
        }
        System.out.println("Imprimindo em ordem contrária: ");
        for (int i = vetorzao.length - 1; i >= 0; i--) { // Aqui tem uns "pulo do gato", mas seria o mesmo que (int i = 6; i >= 0; i--) Ou seja, defino que meu contador começa com a ultima posição do vetor e decremento ele até ele ser menor ou igual a 0
            System.out.println("v[" + i + "] = " + vetorzao[i]);
        }
    }
}
