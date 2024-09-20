package beecrowd;

import java.util.Scanner;

public class Ex5emAula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int linha, coluna;
		do {
			linha = ler.nextInt();
			coluna = ler.nextInt();
			if (linha != coluna) {
				System.err.println("matriz tem que ser quadrada");
			}
		} while (linha != coluna);

		int[][] matrizBi = gerarMatriz(linha, coluna);
		apresentaMatrizBi(matrizBi);
		System.out.println(simetrica(matrizBi));
		ler.close();

	}

	public static int[][] gerarMatriz(int linhas, int colunas) {
		Scanner ler = new Scanner(System.in);

		int[][] matrizBi = new int[linhas][colunas];

		for (int i = 0; i < matrizBi.length; i++) {
			for (int j = 0; j < matrizBi[i].length; j++) {
				matrizBi[i][j] = ler.nextInt();
			}
		}
		ler.close();
		return matrizBi;
	}

	public static boolean simetrica(int[][] matrizBi) {

		boolean simetrica = false;
		for (int i = 0; i < matrizBi.length; i++) {
			for (int j = 0; j < matrizBi[i].length; j++) {
				if ((matrizBi[i][j]) == (matrizBi[j][i])) {
					simetrica = true;
				} else {
					simetrica = false;
					break;
				}
			}
		}
		return simetrica;
	}

	public static void apresentaMatrizBi(int[][] matrizBi) {

		for (int[] i : matrizBi) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
