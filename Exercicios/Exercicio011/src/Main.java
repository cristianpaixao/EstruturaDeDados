import java.util.Scanner;

/**
 * Faça um algoritmo que leia os nomes de 10 alunos e de qual turma eles pertencem: "T1"
 * ou "T2". O algoritmo deve criar 2 vetores, um contendo os nomes dos alunos da "T1" e o
 * outro contendo os nomes dos alunos da "T2". Exiba a quantidade de alunos de cada
 * vetor e o conteúdo dos vetores no final.
 * 
 * Obs.: Não utilizar List ou ArrayList. É para usar vetor mesmo!!!
 *       Não é para deixar "buracos" nos vetores.
 * 
 * @author Cristian Paixão
 */

public class Main {
	
	private static Scanner teclado;

	public static void main(String[] args) {
		// Instanciando os vetores das turmas
		String[] turma1 = new String[10];
		String[] turma2 = new String[10];
		
		teclado = new Scanner(System.in);
		
		// Criando contadores para cada vetor (podia ser um vetor com 2 indices, por exemplo);
		int cont1 = 0;
		int cont2 = 0;
		
		// Coletando alunos e inserindo nas turmas
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a turma do aluno nº " + (i + 1) + ": T1 ou T2");
			String turma = teclado.nextLine();
			if (turma.equals("T1")) {
				System.out.println("Digite o nome do Aluno:");
				turma1[cont1] = teclado.nextLine();
				cont1++;
				continue;
			} else if (turma.equals("T2")) {
				System.out.println("Digite o nome do Aluno:");
				turma2[cont2] = teclado.nextLine();
				cont2++;
				continue;
			}
			i--;
		}
		
		// Imprimindo os aluninhos da turma 1
		System.out.println("A turma 1 tem " + cont1 + " Alunos, são eles:");
		for (int i = 0; i < cont1; i++) {
			System.out.println((i+1) + "- " + turma1[i]);
		}
			
		// Imprimindo os aluninhos da turma 2
		System.out.println("A turma 2 tem " + cont2 + " Alunos, são eles:");
		for (int i = 0; i < cont2; i++) {
			System.out.println((i+1) + "- " + turma2[i]);
		}
	}
}
