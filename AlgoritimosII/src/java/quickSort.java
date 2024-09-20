import java.util.*;

public class quickSort {
    public static void main(String[] args) {
        // vetor
        int[] v = { 5, 6, 2, 7, 9, 1, 8, 3, 7 };

        // particao exercicios
        int p = particao(v);
        System.out.printf("Posição: %d\n", p);
        System.out.println(Arrays.toString(v));

        // ordenando com quickSort
        quickSortFuncao(v, 0, v.length - 1);
        System.out.println(Arrays.toString(v));
    }

    public static void quickSortFuncao(int[] v, int p, int r) {

        if (p < r) {
            int pivo = particaoFuncao(v, p, r);
            quickSortFuncao(v, p, pivo - 1);
            quickSortFuncao(v, pivo + 1, r);
        }
    }

    public static int particaoFuncao(int[] v, int p, int r) {

        int pivo = v[p];
        int i = p + 1;
        int j = r;
        int aux;

        while (i <= j) {
            if (v[i] <= pivo)
                i++;
            else if (v[j] > pivo)
                j--;
            else {
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;
            }

        }
        v[p] = v[j];
        v[j] = pivo;
        return j;

    }

    /*
     * Escreva uma função que recebe um vetor como parâmetro, a sua função
     * seleciona o primeiro elemento de um vetor e rearranja o vetor de forma que
     * todos elementos menores ou iguais ao primeiro elemento fiquem a sua
     * esquerda e os maiores a sua direita.
     * No vetor {5,6,2,7,9,1,8,3,7} após ser rearranjado teríamos
     * {1,3,2,5,9,7,8,6,7}.
     */
    public static int particao(int[] v) {
        int pivo = v[0];
        int i = 1;
        int j = v.length - 1;
        int aux;
        while (i <= j) {
            if (v[i] <= pivo)
                i++;
            else if (v[j] > pivo)
                j--;
            else {
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i++;
                j--;
            }
        }
        v[0] = v[j];
        v[j] = pivo;
        return j;
    }

}
