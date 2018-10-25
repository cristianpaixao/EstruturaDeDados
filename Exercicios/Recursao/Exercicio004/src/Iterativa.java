public class Iterativa {
    public int RetornaImpares(int[] v) {
        int resultado = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) {
                resultado++;
            }
        }
        return resultado;
    }
}
