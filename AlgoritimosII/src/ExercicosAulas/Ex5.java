package ExercicosAulas;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] v = new int[20];

		for (int i = 0; i < v.length; i++) {
			v[i] = ler.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			int temp = v[i];
			v[i] = v[19 - i];
			v[19 - i] = temp;
		}

		for (int i = 0; i < v.length; i++) {
			System.out.printf("N[%d] = %d%n", i, v[i]);
		}
		ler.close();

	}

}
