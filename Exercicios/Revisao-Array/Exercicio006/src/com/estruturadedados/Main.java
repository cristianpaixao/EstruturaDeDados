package com.estruturadedados;

import java.util.Scanner;

/**
 * Escreva um programa que cria um vetor para armazenar 10 inteiros. O programa
 * deve solicitar que o usuário digite 10 números, que devem ser armazenados nesse
 * vetor.
 *
 * O programa deverá calcular a média dos números digitados e exibir a média.
 * Depois, deverá imprimir os números que estão no vetor que estão acima da média.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[10];
	    Scanner teclado = new Scanner(System.in);

	    for (int i = 0; i < nums.length; i++) {
            System.out.println("Informe um valor INTEIRO para a posição [" + i + "] do vetor e pressione [Enter]");
            nums[i] = teclado.nextInt();
        }

        double media = 0; // Sempre tentar inicializar tipos primitivos

        for (int i = 0; i < nums.length; i++) {
            media += nums[i]; // Aproveitando média para somar =P
        }
        media = media / nums.length;

        System.out.println("A média dos números digitados é: " + media);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > media) {
                System.out.println("O número " + nums[i] + " na posição [" + i + "] do vetor é maior que a média " + media);
            }
        }
    }
}
