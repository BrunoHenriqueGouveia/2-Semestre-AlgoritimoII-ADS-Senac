package beecrowd;
import java.util.Random;
import java.util.Scanner;
public class Ex1emAula {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int linha = ler.nextInt();
		int coluna = ler.nextInt();
		int[][] matrizBi = gerarMatriz(linha, coluna);
		
		for(int[] i : matrizBi) {
			for(int j : i ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
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

}
