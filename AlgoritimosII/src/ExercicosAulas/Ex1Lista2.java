package ExercicosAulas;

import java.util.Scanner;

public class Ex1Lista2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char operacao;
		int linha;
		double soma = 0, media;
		double[][] matriz = new double[12][12];

		do {
			linha = ler.nextInt();

		} while (linha < 0 || linha > 12);

		do {
			operacao = ler.next().charAt(0);
		} while (operacao != 'S' && operacao != 'M');

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = ler.nextDouble();
				if (i == linha) {
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
