package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa em java que leia 5 números e armazene-os em um vetor. Depois,
 * deve ler mais 5 números e armazená-los em outro vetor. O programa deverá ordenar os 2
 * vetores em ordem crescente. E depois deverá preencher um outro vetor com os 10 números
 * dos 2 outros vetores, em ordem crescente, intercalando os valores dos vetores.
 *
 * Por exemplo:
 * Vetor 1 (em ordem crescente): 2 4 7 9 13
 * Vetor 2 (em ordem crescente) 1 5 8 9 12
 * Vetor 3: 1 2 4 5 7 8 9 9 12 13
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
    	// Instanciando vetores
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] vetor3 = new int[10];

		// Instanciando Scanner
		Scanner teclado = new Scanner(System.in);

		// Preenchendo vetor 1
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite o valor para a posição [" + i + "] do vetor 1 e pressione [Enter]: ");
			vetor1[i] = teclado.nextInt();
		}

		// Preenchendo vetor 2
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite o valor para a posição [" + i + "] do vetor 2 e pressione [Enter]: ");
			vetor2[i] = teclado.nextInt();
		}

		// Instanciando o ordenador BubbleSort
		BubbleSort ordenador = new BubbleSort();

		// Ordenando os vetores
		vetor1 = ordenador.ordenarVetor(vetor1);
		vetor2 = ordenador.ordenarVetor(vetor2);

		// Adicionando valores dos vetores 1 e 2 no 3 de forma ordenada
		int cont1 = 0, cont2 = 0;
		for (int i = 0; i < vetor3.length; i++) {

			if (cont1 > 4) {
				vetor3[i] = vetor2[cont2];
				cont2++;
			} else if (cont2 > 4) {
				vetor3[i] = vetor1[cont1];
				cont1++;
			} else {
				if (vetor1[cont1] <= vetor2[cont2] && cont1 < 5) {
					vetor3[i] = vetor1[cont1];
					cont1++;
					continue; // Evitando mais um else abaixo
				}
				vetor3[i] = vetor2[cont2];
				cont2++;
			}

		}

		// Preparando resultado de impressão (Podia ter criado uma classe pra isso, mas deu preguicinha, malz);
		String resultado = "Vetor 1 (em ordem crescente):";
		for (int i = 0; i < vetor1.length; i++) {
			resultado += vetor1[i] + " ";
		}

		resultado += "\nVetor2 (em ordem crescente):" ;
		for (int i = 0; i < vetor2.length; i++) {
			resultado += vetor2[i] + " ";
		}
		resultado += "\nVetor3:" ;
		for (int i = 0; i < vetor3.length; i++){
			resultado += vetor3[i] + " ";
		}

		// Imprimindo resultado
		System.out.println(resultado);

    }
}
