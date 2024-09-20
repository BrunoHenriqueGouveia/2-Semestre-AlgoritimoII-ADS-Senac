package beecrowd;

import java.util.Scanner;

public class Ex1847 {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		if((a > b && b < c) || ((a < b && b <= c) || (a < b && c > b && (c-b) >= (b-a))) || ((a > b && b > c) || (a > b && c < b &&(b-c) < (a-b))) || (b==a && b<=c)) {
			System.out.println(":)");
		}
		else {
			System.out.println(":(");
		}
		ler.close();

	}

}
