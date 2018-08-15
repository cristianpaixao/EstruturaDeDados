package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa que solicita que o usuário digite os nomes de 5 modelos de
 * carros (exemplo: Gol, Vectra, HB20, etc), que deverão ser armazenados em um
 * vetor. Depois, o usuário deverá digitar o consume desses carros, ou seja, quantos
 * quilômetros cada um deles faz com um litro de combustível. O consumo de cada
 * modelo deverá ser armazenado em outro vetor. O programa deverá exibir qual o
 * modelo de carro mais econômico
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    String[] modeloDeCarro = new String[5];
	    double[] kmPorLitro = new double[5];

	    Scanner tecladoString = new Scanner(System.in);
        Scanner tecladoDouble = new Scanner(System.in);

	    for (int i = 0; i < modeloDeCarro.length; i++) {
            System.out.println("Digite um nome de carro: ");
            modeloDeCarro[i] = tecladoString.next();

            System.out.println("Digite a kilometragem do carro " + modeloDeCarro[i] + ":");
            kmPorLitro[i] = tecladoDouble.nextDouble();
        }

        int maiorKM = 0;
        for (int i = 1; i < kmPorLitro.length; i++) {
            if (kmPorLitro[i] > kmPorLitro[maiorKM]) {
                maiorKM = i;
            }
        }

        System.out.println("O modelo de carro mais econômico é " + modeloDeCarro[maiorKM]);

    }
}