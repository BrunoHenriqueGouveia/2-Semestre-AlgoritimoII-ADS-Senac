package ExercicosAulas;

import java.util.*;

public class Ex1Lista3Solucao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int N = ler.nextInt();

		ler.nextLine();

		for (int i = 0; i < N; i++) {
			String[] strings = ler.nextLine().split(" ");
			Arrays.sort(strings, new Comparator<String>() {
				public int compare(String s1, String s2) {
					if (s1.length() != s2.length()) {
						return s2.length() - s1.length();
					} else {
						return 0;
					}
				}
			});
			for (int j = 0; j < strings.length; j++) {
				if (j != strings.length - 1) {
					System.out.print(strings[j] + " ");
				} else {
					System.out.println(strings[j]);
				}
			}
		}
		ler.close();
	}
}
