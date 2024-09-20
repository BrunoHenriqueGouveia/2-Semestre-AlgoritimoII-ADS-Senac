package ExercicosAulas;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] v = new int[10];

		for (int i = 0; i < v.length; i++) {
			v[i] = ler.nextInt();
			if (v[i] < 1) {
				v[i] = 1;
			}
		}

		for (int i = 0; i < v.length; i++) {
			System.out.printf("X[%d] = %d%n", i, v[i]);
		}
		ler.close();

	}

}
