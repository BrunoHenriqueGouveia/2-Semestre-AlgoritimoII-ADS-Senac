package ExercicosAulas;

import java.util.Scanner;

public class Ex2Lista2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char operacao;
		int coluna;
		double soma = 0, media;
		double[][] matriz = new double[12][12];

		do {
			coluna = ler.nextInt();

		} while (coluna < 0 || coluna > 12);

		do {
			operacao = ler.next().charAt(0);
		} while (operacao != 'S' && operacao != 'M');

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ler.nextDouble();
				if (j == coluna) {
					soma += matriz[i][j];
				}
			}
		}

		if (operacao == 'S') {
			System.out.printf("%.1f%n", soma);
		} else {
			media = soma / 12;
			System.out.printf("%.1f%n", media);
		}
		ler.close();

	}

}
