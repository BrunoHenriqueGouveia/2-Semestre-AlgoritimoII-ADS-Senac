package ExercicosAulas;

import java.util.Scanner;

public class Ex4Lista2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		char operacao;
		double soma = 0;
		double[][] matriz = new double[12][12];

		do {
			operacao = ler.next().charAt(0);
		} while (operacao != 'S' && operacao != 'M');

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ler.nextDouble();
				if (j > i && j > matriz.length - i - 1) {
					soma += matriz[i][j];
				}
			}

		}

		if (operacao == 'M') {
			soma = soma / 30;
		}
		System.out.printf("%.1f%n", soma);
		
		ler.close();
	}

}
