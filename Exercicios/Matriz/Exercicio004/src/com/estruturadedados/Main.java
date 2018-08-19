package com.estruturadedados;

import java.util.Scanner;

/**
 * Elabore um programa que cria uma matriz 5x2 de String. A primeira coluna deverá
 * armazenar nomes de amigos e a segunda coluna deverá armazenar os números de
 * telefones correspondentes (no formato String). Solicite que o usuário digite os dados para
 * preencher a matriz. Depois, solicite que o usuário digite um nome qualquer. Pesquise o
 * nome na matriz e exiba "Nome não encontrado", caso o nome não esteja na matriz, ou exiba
 * o telefone correspondente, caso o nome esteja na matriz.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    String[][] matriz = new String[5][2];
	    Scanner teclado = new Scanner(System.in);

	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            if (j == 0) {
                    System.out.println("Digite o nome do amigo que deseja cadastrar: ");
                } else {
                    System.out.println("Digite o telefone do " + matriz[i][0]);
                }
                matriz[i][j] = teclado.nextLine();
            }
        }

        while (true) {
            System.out.println("Digite um nome para pesquisar: (ou SOCIOEMOCIONAL para encerrar)");
            String pesquisa = teclado.nextLine();

            if (pesquisa.equals("SOCIOEMOCIONAL")) {
                System.out.println("A Vera chegou, todos fechando os computadores...");
                break;
            }

            int count = 0;
            for (int i = 0; i < matriz.length; i++) {
                if (pesquisa.equals(matriz[i][0])) {
                    count++;
                    System.out.println(count + "- " + matriz[i][0] + "\tTel: " + matriz[i][1]);
                }
            }
            if (count == 0) {
                System.out.println("Nome não encontrado");
            }
        }

    }
}
