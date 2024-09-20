package beecrowd;

import java.util.Scanner;

public class Ex1564 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n;

		while (ler.hasNext()) {

			do {
				n = ler.nextInt();
			} while (n < 0 | n > 100);

			if (n == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		}
		ler.close();

	}

}
