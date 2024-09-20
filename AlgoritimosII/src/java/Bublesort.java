import java.util.Random;

public class BubleSort {
    public static void main(String[] args) {

        int[] vetor = criarVetor(10);
        for (int i : vetor) {
            System.out.print(i + "|");
        }
        System.out.println();

        bubbleSortNumParesAfrente(vetor);
        for (int i : vetor) {
            System.out.print(i + "|");
        }

    }

    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static int[] criarVetor(int tm) {
        Random aleatorio = new Random();
        int[] vetor = new int[tm];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100);
        }
        return vetor;
    }

    public static void bubbleSortNumParesAfrente(int[] vetor) {
        /*
         * Considere um vetor com números pares e ímpares, reescreva o método
         * bolha para colocar todos os números pares à frente no mesmo vetor e os
         * ímpares ao final no mesmo vetor. Você não pode usar outro vetor como
         * área auxiliar.
         * 
         */
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] % 2 != 0 && vetor[j + 1] % 2 == 0) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

}
