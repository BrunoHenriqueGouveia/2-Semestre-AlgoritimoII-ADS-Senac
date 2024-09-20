package beecrowd;
import java.util.Random;
import java.util.Scanner;

public class Ex3emAula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int linha = ler.nextInt();
		int coluna = ler.nextInt();
		int[][] matrizBi = gerarMatriz(linha, coluna);
	    System.out.println(maior(matrizBi));
		ler.close();

	}
	public static int[][] gerarMatriz(int linhas,int colunas){
		Random ale = new Random();
		int[][] matrizBi = new int [linhas] [colunas];
		
		for(int i =0; i< matrizBi.length;i++) {
			for(int j = 0;j< matrizBi[i].length;j++) {
				matrizBi[i][j] = ale.nextInt(101);
			}
		}
		return matrizBi;
	}
	public static int maior(int[][] matriz) {
		int maior=0;
		for(int i =0; i< matriz.length;i++) {
			for(int j = 0;j< matriz[i].length;j++) {
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		return maior;
	}

}
