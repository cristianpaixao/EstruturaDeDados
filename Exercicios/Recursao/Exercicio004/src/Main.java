/**
 * Implementar a versão recursiva e iterativa do algoritmo:
 *
 * Dado um vetor de inteiros, devolve a quantidade de elementos ímpares que há
 * no vetor.
 *
 * Ex: Seja um vetor com os valores [7,3,5,2]
 * A quantidade e ímpares desse vetor é 3
 *
 */
public class Main {

    public static void main(String[] args) {
        int[] v = {7,3,5,2};

        Iterativa iterativa = new Iterativa();
        Recursiva recursiva = new Recursiva();

        System.out.println(iterativa.RetornaImpares(v));
        System.out.println(recursiva.RetornaImpares(v, v.length -1));
    }
}
