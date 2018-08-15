import java.util.Scanner;

/**
 * 
 * 
 * @author Cristian Paixão
 */
public class Main {

	private static Scanner teclado;

	public static String exibeMatriz (int[][] m) {
		/*
		 * Exibe os valores da matriz, no formato de matriz
		 */
		String resultado = "";
		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m[linha].length; coluna++) {
				resultado += m[linha][coluna] + "\t";
			}
			resultado+= "\n";
		}
		return resultado;
	}
	public static void main(String[] args) {

		// criação de uma matriz de int de 3 linhas e 4 colunas
		int[][] matriz = new int[3][4];
		
		
		teclado = new Scanner(System.in);
		
		/*
		 * Solicita que o usuário digite os valores para
		 * preencher a matriz
		 */
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Digite o valor para a linha " + (linha + 1) + " na coluna " + (coluna + 1));
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		System.out.println(exibeMatriz(matriz));
		

	}

}
