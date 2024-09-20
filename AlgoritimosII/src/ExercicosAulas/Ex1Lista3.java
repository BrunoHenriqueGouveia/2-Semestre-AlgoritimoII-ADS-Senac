package ExercicosAulas;

import java.util.Scanner;

public class Ex1Lista3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		ler.nextLine();
		String palavras,aux;
		int posicaoMenor;

		for (int i = 0; i < n; i++) {

			do {
				palavras = ler.nextLine();
			} while (palavras.length() > 50);

			String[] vetor = palavras.split(" ");
			

			for (int j = 0; j < vetor.length; j++){
				posicaoMenor = j;
				for (int k = j+1; k < vetor.length; k++) {
					
					if (vetor[k].length() > vetor[posicaoMenor].length()) {
						posicaoMenor=k;
					}
				}
				aux = vetor[posicaoMenor];
				vetor[posicaoMenor] = vetor[j];
				vetor[j] = aux;
			}

			for (String l : vetor) {
				System.out.print(l + " ");
			}

			System.out.println();
		}
		ler.close();

	}

}
