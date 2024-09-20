package ExercicosAulas;

import java.util.Random;
import java.util.Scanner;

public class Ado1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		/*
		 * Entrega a Atividade 1 - Algoritmos e Programação II
		 * 
		 * Nós,
		 * 
		 * Bruno Henrique Gouveia Da Silva,Lucas Vasconcelos de Oliveira Nunes Bento
		 * 
		 * declaramos que
		 * 
		 * todas as respostas são fruto de nosso próprio trabalho, não copiamos
		 * respostas de colegas externos à equipe, não disponibilizamos nossas respostas
		 * para colegas externos ao grupo e não realizamos quaisquer outras atividades
		 * desonestas para nos beneficiar ou prejudicar outros.
		 */

		int opcao, n = 0, m = 0;
		int[] vetor = null;
		boolean iniciar = false, finalizar = true;

		while (finalizar) {

			do {// opções
				System.out.println("||=================================================================||");
				System.out.println("||                       Escolha a opção                           ||");
				System.out.println("||=================================================================||");
				System.out.println("||1: Inicializar o vetor com números aleatórios                    ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||2: Imprimir o vetor                                              ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||3: Verificar se um determinado número está contido no vetor      ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||4: Buscar o maior número armazenado no vetor                     ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||5: Calcular a média dos números pares armazenados no vetor       ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||6: Calcular o percentual dos números ímpares armazenados no vetor||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||7: Calcula a média centralizada dos números armazenados no vetor ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println(
						"||8: Verificar se dado um valor existe dois números em posições,   || \n||   distintas que somados são iguais ao valor informado           ||");
				System.out.println("||-----------------------------------------------------------------||");
				System.out.println("||9:                     Finalizar o programa                      ||");
				System.out.println("||=================================================================||");
				System.out.println();
				opcao = ler.nextInt();
				if (opcao > 9 | opcao < 1) {// se o numero digitado pelo usuario nao estiver nas opçao ele exibi uma
											// mensagem e
											// fica repitindo ate que o usuario informe uma opçao correta
					System.err.println("Opção invalida, tente novamente:");
				}
			} while (opcao > 9 | opcao < 1);

			switch (opcao) {
			// opção 1 inicializar vetor com numeros aleatorios
			case 1 -> {
				System.out.println("digite o tamanho do vetor eo valor maximo da posição:");
				do {
					n = ler.nextInt();
					m = ler.nextInt();
				} while (n > m | n < 1);
				vetor = VetorAleatorio(n, m + 1);
				iniciar = true;
				System.out.println("vetor inicializado com sucesso");
				System.out.println();
			}
			// opção 2 imprimir vetor
			case 2 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {
					VetorImprimir(vetor);
					System.out.println();
				}

			}
			// opção 3 informa um valor a ser procurado
			case 3 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {
					System.out.print("informe o valor a ser procurado no vetor: ");
					int numProcurar = ler.nextInt();
					int numero = NumAprocurar(numProcurar, vetor);

					if (numero == -1) {
						System.out.println("O número informado não foi encontrado");
					} else {
						System.out.println("O número informado foi encontrado na posição: " + numero + " do vetor");
					}
					System.out.println();
				}

			}
			// opção 4 informa o maior numero
			case 4 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {
					System.out.println("Maior Numero:" + MaiorNum(vetor));
					System.out.println();
				}

			}
			// opção 5 informa a media de numeros pares
			case 5 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {
					double media = media(vetor);
					System.out.printf("A media dos numeros pares armazenados no vetor é: %.1f%n", media);
					System.out.println();
				}

			}
			// opção 6 informa o percentual de numeros impares
			case 6 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {
					double percentual = percentual(vetor);
					System.out.printf("O percentual de numeros impares armazenados no vetor é: %.0f%%%n", percentual);
					System.out.println();
				}

			}
			// opçao 7 informa a media centralizada
			case 7 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {

					System.out.printf("A media centralizada é %.1f%n", mediaCentralizada(vetor));
					System.out.println();
				}

			}
			// opção 8 informa se contem dois numeos em posiçõe sdistintas iguias ao numero
			// informado
			case 8 -> {
				if (iniciar == false) {
					System.err.println("Para iniciar essa opção, inicialize o vetor primeiro (Opção 1)");
					System.out.println();
				} else {
					System.out.println("informe o numero:");
					int num = ler.nextInt();
					if (!opcao8(vetor, num)) {
						System.out.println("Não existem dois números no vetor que somados resultam em " + num);

					} else {
						System.out.println("Existem dois números no vetor que somados resultam em " + num);

					}

				}

			}
			// opção 9 Encerrar o programa
			case 9 -> {
				System.out.println();
				System.out.println("programa encerrado");
				System.out.println("Ate proxima!!");
				finalizar = false;
			}

			}
		}
		ler.close();

	}

	public static int[] VetorAleatorio(int a, int b) {// tamanho e numero maximo do vetor opçao1
		Random aleatorio = new Random();

		int[] vetor = new int[a];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(b);

		}
		return vetor;

	}

	public static void VetorImprimir(int[] vetor) {// impressao do vetor opçao2

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
		}
		System.out.println();
	}

	public static int NumAprocurar(int num, int[] vetor) {// se contem um numero no vetor opção 3
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static double media(int vetor[]) {// media de numeros pares opçao 5
		double media = 0.0;
		int qtd = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				media += vetor[i];
				qtd++;
			}
		}

		return media / qtd;

	}

	public static double percentual(int vetor[]) {// percentual de numeros impares opção 6
		double numImpares = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 1) {
				numImpares++;
			}
		}
		return (numImpares / vetor.length) * 100;

	}

	public static int MaiorNum(int[] vetor) {// vai buscar o maior numero do vetor opcao 4
		int maior = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return maior;

	}

	public static double mediaCentralizada(int vetor[]) {// retorna media centralizada opção 7

		double media = 0.0;
		int menor = vetor[0], maior = vetor[0], posMaior = 0, posMenor = 0, qtd = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
				posMenor = i;
			}

		}

		for (int i = 0; i < vetor.length; i++) {

			if (posMaior != i && posMenor != i) {
				media += vetor[i];
				qtd++;
			}
		}
		return media / qtd;

	}

	public static boolean opcao8(int vetor[], int num) {// retorna boolean se a soma de dois numeros é igual ao
														// informado pelo usuario
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length && j != i; j++) {
				soma = vetor[i] + vetor[j];
				if (soma == num) {
					return true;
				}
			}
		}
		return false;

	}

}
