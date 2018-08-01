
import java.util.Scanner;



/**
 * Elaborar um programa que exiba o seguinte menu ao usuário:
 *     1 - Exibir os números pares de 0 a 20
 *     2 - Ler 10 números com while e exibir a soma desses 10 números
 *     3 - Ler vários números com do/while, até que o usuário digite um valor 
 * negativo e exibir a quantidade de números pares positivos que foram digitados
 *     4 - Sair
 * O programa deverá ficar num loop, exibindo esse menu e executando a opção
 * desejada pelo usuário, até que a opção 4 seja escolhida.
 * Utilizar switch/case para comparar as opções.
 * @author Cristian Paixão
 */
public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner teclado = new Scanner(System.in);
 
        while (repeat) {
            int opcao = 0;
            System.out.println("Escolha a Opção: \n"
                    + "1 - Exibir os números pares de 0 a 20 \n"
                    + "2 - Ler 10 números com while e exibir a soma desses 10 números \n"
                    + "3 - Ler vários números com do/while, até que o usuário digite um valor negativo e exibir a quantidade de números pares positivos que foram digitados \n"
                    + "4 - Sair");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    int num = 0;
                    while (num <= 20) {
                        if (num % 2 == 0 && num != 0) {
                            System.out.println(num);
                        }
                        num++;
                    }
                    break;
                case 2:
                    int cont = 0;
                    int result = 0;
                    while (cont < 10) {
                        System.out.println("Escreva o " + (cont + 1) + "º numero a ser somado");
                        result += teclado.nextInt();
                        cont++;
                    }
                    System.out.println("O Resultado da soma é: " + result);
                    break;
                case 3:
                    int contPositivos = 0;
                    int numeroAtual = 0;
                    do {
                        numeroAtual = teclado.nextInt();
                        if (numeroAtual % 2 == 1) {
                            contPositivos++;
                        }
                    } while (numeroAtual >= 0);
                    System.out.println("Foram digitados " + contPositivos + " números pares positivos.");
                    break;
                case 4:
                    repeat = false;
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    break;
            }  
                  
        }
    }
}
