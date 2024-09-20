package beecrowd;

import java.util.Random;
import java.util.Scanner;

public class Ex4emAula {

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
		int[] vetor = traco(matrizBi);

		apresentaMatrizBi(matrizBi);
		apresentaTraco(vetor);
		ler.close();

	}

	public static int[][] gerarMatriz(int linhas, int colunas) {
		Random ale = new Random();
		int[][] matrizBi = new int[linhas][colunas];

		for (int i = 0; i < matrizBi.length; i++) {
			for (int j = 0; j < matrizBi[i].length; j++) {
				matrizBi[i][j] = ale.nextInt(101);
			}
		}
		return matrizBi;
	}

	public static int[] traco(int[][] matriz) {
		int x = 0;
		int[] vetor = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					vetor[x] = matriz[i][j];
					x++;
				}
			}
		}
		return vetor;

	}

	public static void apresentaMatrizBi(int[][] matrizBi) {

		for (int[] i : matrizBi) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void apresentaTraco(int[] vetor) {

		System.out.println("Diagonal da Matriz:");
		for (int i : vetor) {
			System.out.println(i);
		}

	}

}
