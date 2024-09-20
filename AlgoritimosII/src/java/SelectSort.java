import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {

        int[] vetor = { 32, 17, 51, 8, 23 };
        selectionSort(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    public static void selectionSort(int[] v) {
        int aux, min;
        for (int i = 0; i < v.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            if (i != min) {
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
    }
}
