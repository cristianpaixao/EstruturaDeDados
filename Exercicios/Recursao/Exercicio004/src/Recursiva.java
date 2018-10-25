public class Recursiva {

    public int RetornaImpares(int[] v, int tamanhoVetor) {
        if (v[tamanhoVetor] % 2 == 0) {
            return 0 + RetornaImpares(v , tamanhoVetor - 1);
        }
        if(tamanhoVetor == 0) return 1;
        return 1 + RetornaImpares(v, tamanhoVetor -1);
    }
}
