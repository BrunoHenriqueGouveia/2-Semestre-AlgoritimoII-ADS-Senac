package beecrowd;

import java.util.Scanner;

public class Ex1828 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int t;
		String partida, ganhou;

		do {
			t = ler.nextInt();
		} while (t < 1 || t > 100);

		for (int i = 1; i <= t; i++) {
			partida = ler.nextLine();
			String[] vetor = partida.split(" ");
			ganhou = ganhou(vetor);
			System.out.println("Caso #" + i + ":" + ganhou);
		}

	}

	public static String ganhou(String[] vetor) {
		String ganhou = " ";

		if (vetor[0].equals(vetor[1])) {
			ganhou = "De novo!";
		}

		else {

			if (vetor[0].equals("tesoura") && vetor[1].equals("papel") || vetor[1].equals("largato")) {
				ganhou = "Bazinga!";
			}

			else if (vetor[0].equals("papel") && vetor[1].equals("pedra") || vetor[1].equals("Spock")) {
				ganhou = "Bazinga!";
			} else if (vetor[0].equals("pedra") && vetor[1].equals("largato") || vetor[1].equals("tesoura")) {
				ganhou = "Bazinga!";
			} else if (vetor[0].equals("largato") && vetor[1].equals("Spock") || vetor[1].equals("papel")) {
				ganhou = "Bazinga!";
			} else if (vetor[0].equals("Spock") && vetor[1].equals("tesoura") || vetor[1].equals("pedra")) {
				ganhou = "Bazinga!";
			} else {
				ganhou = "Raj Trapaceou";
			}
		}

		return ganhou;
	}

}
