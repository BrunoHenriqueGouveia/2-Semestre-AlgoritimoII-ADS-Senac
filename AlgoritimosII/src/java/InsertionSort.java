public class InsertionSort {
    public static void main(String[] args) {

        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i : vetor) {
            System.out.print(i + "|");
        }
        System.out.println();
        ordenaporPares(vetor);
        for (int i : vetor) {
            System.out.print(i + "|");
        }
    }

    public static void insertionSort(int vetor[]) {

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

    }

    /*
     * Considere um vetor com números pares e ímpares, reescreva o método
     * de ordenação por inserção para colocar todos os números pares à
     * frente no mesmo vetor e os ímpares ao final no mesmo vetor. Você não
     * pode usar outro vetor como área auxiliar.
     */
    public static void ordenaporPares(int vetor[]) {

        int aux, j;

        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            if (aux % 2 == 0) {
                while (j >= 0 && vetor[j] % 2 != 0) {
                    vetor[j + 1] = vetor[j];
                    j--;
                }
            } else {
                while (j >= 0 && vetor[j] % 2 == 0) {
                    vetor[j + 1] = vetor[j];
                    j--;
                }
            }

            vetor[j + 1] = aux;
        }

    }
}
