package beecrowd;

import java.util.Scanner;

public class Ex1789 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int l, v, n = 0;

		

		while (ler.hasNext()) {
			do {
				l = ler.nextInt();
			} while (l < 1 | l > 500);
			
			for (int i = 0; i < l; i++) {
				
				do {
					v = ler.nextInt();
				} while (v < 1 | v > 50);

				if (v < 10) {
					if (n <= 1) {
						n = 1;
					}
				} else if (v < 20) {
					if (n <= 2) {
						n = 2;
					}
				} else {

					n = 3;

				}

			}
			System.out.println(n);
		}
		ler.close();

	}

}
