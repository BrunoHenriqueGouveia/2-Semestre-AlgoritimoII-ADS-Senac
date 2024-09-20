package ExercicosAulas;

import java.util.Scanner;

public class Ex3Lista2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char operacao;
		int x = 0;
		double soma = 0, media;
		double[][] matriz = new double[12][12];

		do {
			operacao = ler.next().charAt(0);
		} while (operacao != 'S' && operacao != 'M');

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ler.nextDouble();
				if (j >= x && i < 11) {
					soma += matriz[i][j];
				}
			}
			x++;
		}

		if (operacao == 'S') {
			System.out.printf("%.1f%n", soma);
		} else {
			media = soma / 66;
			System.out.printf("%.1f%n", media);
		}
		ler.close();
	}

}
