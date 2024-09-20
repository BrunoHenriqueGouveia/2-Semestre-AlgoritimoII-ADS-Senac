public class ExercicioRecursividade {

    public static void main(String[] args) {
        int[] vetor = { 2, 8, 6, 3, 1, 4, 8 };

        // System.out.println(potencia(2, 4));
        // binario(18);
        // System.out.println(buscaLinear(vetor, 4, 0));
        // System.out.println(soma(vetor, 0));
        System.out.println(menor(vetor, 0));
        // System.out.println(media(vetor, 0));
    }

    // Implemente uma função recursiva para calcular a potência a n, supondo que
    // tanto a quanto n sejam números inteiros positivos.
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
    // Implemente uma função recursiva que receba como parâmetro um
    // número natural e apresente o seu correspondente binário.

    public static void binario(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            binario(n / 2);
            System.out.print(n % 2);
        }
    }

    /*
     * Dado um vetor de números inteiros positivos, implemente funções recursivas
     * para:
     */

    /* a) Fazer a busca linear de um elemento no vetor; */
    public static int buscaLinear(int[] vetor, int x, int i) {

        if (i == vetor.length)
            return -1;
        if (vetor[i] == x)
            return i;
        return buscaLinear(vetor, x, i + 1);
    }

    /* b) Encontrar o menor elemento no vetor; */
    public static int menor(int[] vetor, int i) {
        if (i == 1)
            return vetor[0];

        int m = menor(vetor, i - 1);

        if (m < vetor[i - 1])
            return m;
        return vetor[i - 1];

    }

    /* c) Fazer a soma dos elementos no vetor; */
    public static int soma(int[] vetor, int i) {
        if (i == vetor.length)
            return 0;
        return vetor[i] + soma(vetor, i + 1);
    }

    /* d) Calcular a média aritmética dos elementos no vetor. */
    public static double media(int[] vetor, int i) {
        if (i == vetor.length)
            return 0;
        double soma = vetor[i] + media(vetor, i + 1);
        if (i == 0)
            return soma / vetor.length;
        return soma;

    }

}