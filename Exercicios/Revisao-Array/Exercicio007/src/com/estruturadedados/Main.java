package com.estruturadedados;

import java.util.Scanner;

/**
 * Elaborar um programa que solicita que o usuário digite o dia (número de 1 a 31) e o
 * mês (número de 1 a 12). O programa deverá exibir qual é esse dia do ano,
 * considerando desde o início do ano.
 *
 * Exemplo:
 * O dia 18/1 corresponde ao dia 18 do ano.
 * O dia 23/2 corresponde ao dia 54 do ano. (31 dias de janeiro + 23 dias de fevereiro)
 * O dia 5/3 corresponde ao dia 64 do ano. (31 dias de janeiro + 28 dias de fevereiro +
 * 5 dias de março)
 *
 * Dica:
 * Utilize um vetor contendo o número de dias de cada mês do ano.
 *
 * @author Cristian Paixão
 */
public class Main {

    public static void main(String[] args) {
	    int[] diasPorMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Criando array e inicializando
        Scanner teclado = new Scanner(System.in);
        int dia, mes;

        // Garantindo o input do dia de forma coesa
        while (true) {
            System.out.println("Digite o dia (de 1 a 31) e pressione [Enter]: ");
            dia = teclado.nextInt();
            if (dia > 0 && dia <=31) {
                break;
            }
            System.out.println("Dia Inválido! ");
        }

        // Garantindo o input do mes de forma coesa
        while (true) {
            System.out.println("Digite o mês (de 1 a 12) e pressione [Enter]: ");
            mes = teclado.nextInt();
            if (mes > 0 && mes <=12) {
                break;
            }
            System.out.println("Mês Inválido! ");
        }

        int diaDoAno = 0;
        for (int i = 0; i < mes; i++) {
            if (mes == i+1) { // Garantido que o mês "inputado" não seja somado
                continue;
            }
            diaDoAno += diasPorMes[i];
        }
        diaDoAno += dia;
        System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia "+ diaDoAno +" do ano.");

    }
}
