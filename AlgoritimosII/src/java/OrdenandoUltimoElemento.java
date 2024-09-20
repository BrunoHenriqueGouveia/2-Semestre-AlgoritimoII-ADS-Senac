public class OrdenandoUltimoElemento{
    /*
     * Considere um vetor já quase ordenado, somente o elemento último elemento
     * está na posição errada, escreva uma função que receba um vetor já quase
     * ordenado, e reordene o vetor, em no máximo n passos onde n é o tamanho
     * do vetor, sem utilizar o método bolha.
     * Considere o exemplo abaixo, o elemento no índice 7 está fora de ordem:
     */
    public static void main(String[] args) {
        int vetor[] = { 3, 5, 9, 11, 15, 17, 19, 6 };

        vetorOrdenadoCorrecao(vetor);

        for (int i : vetor) {
            System.out.print(i + "|");
        }

    }

    public static int[] vetorOrdenado(int[] vetor) {

        for (int i = vetor.length - 1; i > 0; i--) {

            if (vetor[i] < vetor[i - 1]) {
                int aux = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = aux;
            }

        }
        return vetor;

    }

    public static void vetorOrdenadoCorrecao(int[] vetor) {
        int k = vetor.length - 1;
        int aux = vetor[k];
        while (k > 0 && vetor[k - 1] > aux) {
            vetor[k] = vetor[k - 1];
            k--;
        }
        vetor[k] = aux;
    }
}
