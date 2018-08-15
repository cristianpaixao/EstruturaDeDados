package com.estruturadedados;

import java.util.Scanner;

/**
 * Sem utilizar vetor, elaborar um programa que solicite que o usuário digite um valor inteiro "n" que seja maior
 * ou igual a 3 e menor ou igual a 10. Enquanto o valor n não estiver nesse intervalo, o usuário deve digitar
 * novamente.
 *
 * Solicite que o usuário digite a nota continuada e a nota semestral de n alunos. Chamar o método calculaMedia,
 * para cada um dos alunos passando a nota continuada e a nota semestral como argumentos. O método calcula e retorna
 * a média de cada aluno para o main.
 * O main deve exibir a média retornada e se o aluno foi Aprovado ou Reprovado.
 *
 * No final, o programa deverá exibir a menor média calculada, a maior média calculada e a média das médias.
 *
 * Implementar o método calculaMedia, que recebe a nota continuada e a nota semestral de um aluno, calcula a média
 * ponderada como é calculada na Bandtec e retorna a média calculada.
 *      media = notaCont * 0.4f + notaSem * 0.6f
 *
 * @author Cristian Paixão
 */
public class Main {
    public static double calculaMedia (double notaCont, double notaSem) {
        double media = (notaCont * 0.4) + (notaSem * 0.6);
        return media;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um valor entre 3 e 10 e pressione [Enter]: ");
            n = teclado.nextInt();
        } while (!(n >= 3 && n <= 10));

        String resultado = ""; // Inicializada porque faremos uma String gigante em breve aqui...
        double mediaDaMedia = 0, maiorMedia = 0, menorMedia = 1000; // Gambiarrinha de leve =D (Fins acadêmicos)

        for (int i = 1; i <= n; i++) {
            double notaCont, notaSem, media;
            System.out.println("Digite a nota continuada do aluno " + i + " e pressione [Enter]:");
            notaCont = teclado.nextDouble();
            System.out.println("Digite a nota semestral do aluno " + i + " e pressione [Enter]:");
            notaSem = teclado.nextDouble();
            media = calculaMedia(notaCont, notaSem);

            String estado = "Reprovado"; // Evitando usar else para a condicional abaixo ;)
            if (media >= 5) {
                estado = "Aprovado";
            }

            mediaDaMedia += media;

            if (media > maiorMedia) maiorMedia = media; // Identificando maior média
            if (media < menorMedia) menorMedia = media; // Identificando menor média

            resultado += "O Aluno " + i + " tirou a média " + media + ", portanto está " + estado + "\n"; // Olha o bicho vindo moleque!!!
        }
        System.out.println(resultado);
        System.out.println("A Menor média foi " + menorMedia + ", a maior média foi " + maiorMedia + " e a média das médias é " + (mediaDaMedia / n));
    }
}
