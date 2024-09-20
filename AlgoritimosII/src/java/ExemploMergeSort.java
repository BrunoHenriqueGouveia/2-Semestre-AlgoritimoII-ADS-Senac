public class ExemploMergeSort {
    public static void main(String[] args) {
        /*
         * int[] a = { 1, 3, 6, 7 };
         * int[] b = { 2, 4, 5 };
         * int[] c = intercalar(a, b);
         * 
         * System.out.println("Vetor intercalado: ");
         * for (int i : c) {
         * System.out.println(i);
         * }
         */
        int[] vetor = { 5, 6, 2, 7, 9, 1, 8, 3, 7 };
        ordenaMenorQuePrimeiro(vetor);
        for (int i : vetor) {
            System.out.print(i + "|");
        }

    }

    public static int[] intercalar(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int ctdA = 0;
        int ctdB = 0;
        int ctdC = 0;

        while (ctdA < a.length && ctdB < b.length) {

            if (a[ctdA] < b[ctdB]) {
                c[ctdC] = a[ctdA];
                ctdA++;
                ctdC++;
            } else {
                c[ctdC] = b[ctdB];
                ctdB++;
                ctdC++;
            }
        }

        while (ctdA < a.length) {
            c[ctdC] = a[ctdA];
            ctdA++;
            ctdC++;
        }

        while (ctdB < b.length) {
            c[ctdC] = b[ctdB];
            ctdB++;
            ctdC++;
        }

        return c;

    }

}
