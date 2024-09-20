package ExercicosAulas;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1ListabuscaBinaria {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] vetor = criarVetor(100);
		int num,pos;
		Arrays.sort(vetor);

		System.out.println("qual tipo de vetor voçe quer crescente ou decrescente:");
		String opcao = ler.nextLine();

		if (opcao.equalsIgnoreCase("crescente")) {
			for (int i : vetor) {
				System.out.print(i + "|");
			}
			System.out.println();
			num = ler.nextInt();
		    pos = buscaBinaria(vetor, num);

			if (pos == -1) {
				System.out.println("O numero nao foi encontrado");
			} else {
				System.out.println("o numero esta na posicao " + pos);
			}

		} else if(opcao.equalsIgnoreCase("decrescente")) {
			vetor = vetorDecrecente(vetor);
			for (int i : vetor) {
				System.out.print(i + "|");
			}
			System.out.println();
			System.out.println("informe o numero:");
			num = ler.nextInt();
			pos= buscaBinariaDescrecente(vetor, num);

			if (pos == -1) {
				System.out.println("O numero nao foi encontrado");
			} else {
				System.out.println("o numero esta na posicao " + pos);
			}
		}

		ler.close();

	}

	public static int[] criarVetor(int tm) {
		Random aleatorio = new Random();
		int[] vetor = new int[tm];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(100);
		}
		return vetor;
	}

	public static int buscaBinaria(int[] vetor, int valorProcurado) {

		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (vetor[meio] == valorProcurado) {
				return meio;
			} else if (valorProcurado < vetor[meio]) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return -1;

	}

	public static int[] vetorDecrecente(int[] vetor) {

		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] > vetor[i]) {
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		return vetor;
	}

	public static int buscaBinariaDescrecente(int[] vetor, int valorProcurado) {

		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (vetor[meio] == valorProcurado) {
				return meio;
			} else if (valorProcurado > vetor[meio]) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return -1;

	}

}
