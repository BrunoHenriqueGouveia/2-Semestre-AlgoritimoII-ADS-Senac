package ExercicosAulas;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int menorValor = 1000, posicao = 0, n;

		do {
			n = ler.nextInt();
		} while (n < 1 || n > 1000);

		int[] x = new int[n];

		for (int i = 0; i < x.length; i++) {

			x[i] = ler.nextInt();

			menorValor = Math.min(x[i], menorValor);

			for (int j = 0; j < x.length; j++) {
				if (menorValor == x[i]) {
					posicao = i;
				}
			}

		}

		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posicao: " + posicao);
		ler.close();
	}

}
