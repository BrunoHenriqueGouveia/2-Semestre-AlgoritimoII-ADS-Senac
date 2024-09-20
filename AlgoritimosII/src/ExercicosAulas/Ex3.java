package ExercicosAulas;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] v = new int[10];
		int num;
		do {
			num = ler.nextInt();
		} while (num > 50);
		
		for(int i = 0;i<v.length;i++) {
			v[i]=num ;
			num= num*2;
		}
		
		for(int i = 0; i<v.length;i++) {
			System.out.printf("N[%d] = %d%n",i,v[i]);
		}
		ler.close();

	}

}
