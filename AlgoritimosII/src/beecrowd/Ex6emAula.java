package beecrowd;

import java.util.Random;
import java.util.Scanner;

public class Ex6emAula {

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

		int[][] matrizA = gerarMatriz(linha, coluna);
		int[][] matrizB = gerarMatriz(linha, coluna);
		int[][] matrizC = matrizBi(matrizA, matrizB);
		apresentaMatrizBi(matrizA);
		System.out.println();
		apresentaMatrizBi(matrizB);
		System.out.println();
		apresentaMatrizBi(matrizC);
		ler.close();

	}

	public static int[][] gerarMatriz(int linhas, int colunas) {
		Random ale = new Random();

		int[][] matrizBi = new int[linhas][colunas];

		for (int i = 0; i < matrizBi.length; i++) {
			for (int j = 0; j < matrizBi[i].length; j++) {
				matrizBi[i][j] = ale.nextInt(50);
			}
		}
		return matrizBi;
	}

	public static int[][] matrizBi(int[][] matrizA, int[][] matrizB) {
		int[][] matrizC = new int[matrizA.length][matrizA.length];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		return matrizC;
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
