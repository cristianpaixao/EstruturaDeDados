package com.estruturadedados;

import java.util.Scanner;

/**
 * Escreva um programa que cria um vetor para armazenar 10 Strings. O programa
 * deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse
 * vetor.
 *
 * Depois o programa deve pedir que se digite um nome qualquer. O programa
 * deverá pesquisar se esse nome está no vetor.
 *
 * Se estiver, deve exibir a sua posição no vetor (índice), senão deve exibir uma
 * mensagem de "Nome inexistente".
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o " + (i+1) + "º nome da lista e pressione [Enter]");
            nomes[i] = teclado.next();
        }
        System.out.println("Digite um nome para pesquisá-lo na lista e pressione [Enter] ");
        String nomeProcurado = teclado.next();
        int contadorEncontrados = 0;
        String resultado = ""; // Adicionando frescura no exercício.

        for (int i = 0; i < nomes.length; i++) {
            if (nomeProcurado.equals(nomes[i])) {
                resultado += "O nome " + nomeProcurado + " foi encontrado na posição [" + i + "] do vetor, \n";
                contadorEncontrados++;
            }

        }
        if (contadorEncontrados > 0) {
            System.out.println(resultado);
        } else {
            System.out.println("Nome inexistente");
        }

    }
}
