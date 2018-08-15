
import java.util.Scanner;

/**
 * Escreva o método verificaPrimo que recebe um número inteiro e exibe se esse
 * número é ou não primo. (Dica: para saber se o número é primo, veja quantos
 * divisores o número tem, ou seja, verifique se ele é divisivel por 1, 2, 3, etc...
 * até ele próprio, e conte quantos divisores são. Se o número de divisores for
 * 2, então ele é´primo.) Escreva o método main que solicita que o usuário digite
 * vários valores positivos e chame o método verificaPrimo para exibir se o número
 * lido é primo ou não. O programa deve encerrar quando o usuário digitar um valor
 * negativo.
 * 
 * @author Cristian Paixão
 */
public class Main {
    public static boolean verificaPrimo(int numero) {
        for (int i = 2; i <= numero; i++) {
            if ( ( (numero % i) == 0) && (i != numero) ) {
                return false;
            }
	}
        return true;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            if (verificaPrimo(numero)) {
                System.out.println("O Número " + numero + " é primo");
            } else {
                System.out.println("O Número " + numero + " não é primo");
            }
        } while (numero > 0);
    }
}
