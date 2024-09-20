package ExercicosAulas;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[] par = new int[5];
		int[] impar = new int[5];
		int num, ctdpar = 0, ctdimpar = 0;

		for (int i = 0; i < 15; i++) {
			num = ler.nextInt();

			if (num % 2 == 0) {

				par[ctdpar] = num;
				ctdpar++;

				if (ctdpar == 5) {

					for (int j = 0; j < par.length; j++) {
						System.out.println("par[" + j + "] = " + par[j]);
					}
					ctdpar = 0;
				}
			} else {

				impar[ctdimpar] = num;
				ctdimpar++;

				if (ctdimpar == 5) {
					for (int k = 0; k < impar.length; k++) {
						System.out.println("impar[" + k + "] = " + impar[k]);
					}
					ctdimpar = 0;
				}
			}
		}
		for (int i = 0; i < ctdimpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
		}
		for (int i = 0; i < ctdpar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
		}
		ler.close();

	}

}
