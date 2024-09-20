package beecrowd;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int senha;
		
		do {
		senha = ler.nextInt();
		
		if(senha == 2002) {
			System.out.println("Acesso Permitido");
		}
		else {
			System.out.println("Senha Invalida");
		}
		} while (senha != 2002);
		ler.close();

	}

}
