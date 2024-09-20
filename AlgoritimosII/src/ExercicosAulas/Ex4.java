package ExercicosAulas;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 0, j = 0;
		double[] v = new double[10];

		for (int i = 0; i < v.length; i++) {
			v[i] = ler.nextDouble();
			if (v[i] <= 10) {
				n++;
			}
		}
		double[] v2 = new double[n];
		int[] posicao = new int[n];

		for (int i = 0; i < v.length; i++) {
			if (v[i] <= 10) {
				v2[j] = v[i];
				posicao[j] = i;
				j++;
			}
		}

		for (int i = 0; i < v2.length; i++) {
			System.out.printf("A[%d] = %.1f%n", posicao[i], v2[i]);
		}
		ler.close();

	}

}
