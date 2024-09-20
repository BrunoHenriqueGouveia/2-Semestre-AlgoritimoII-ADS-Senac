package beecrowd;

import java.util.Scanner;

public class MaiorEposicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, maior = 0, posicao = 0;

		for (int i = 1; i <= 100; i++) {

			do {
				num = ler.nextInt();
			} while (num < 0);

			if (num > maior) {
				maior = num;
				posicao = i;
			}

		}
		System.out.println(maior);
		System.out.println(posicao);
		ler.close();

	}

}
