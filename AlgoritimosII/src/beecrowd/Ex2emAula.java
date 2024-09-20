package beecrowd;


public class Ex2emAula{
	public static void main(String[] args) {
		int a[][] = {{0, 4, 5,9,6}, 
				    {-5, 6, 8,7,3},
				    {-7, 4, 3,2,2}};
		
		int[][] b = matrizBi(a);

		for (int[] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static int[][] matrizBi(int[][] matriz){
		
		int l =matriz.length;
        int c = matriz[0].length;
        int[][] b = new int[c][l];
        
		for(int i = 0;i<matriz.length;i++) {
			for(int j=0; j < matriz[i].length; j++) {
				
				b[j][i]=matriz[i][j];
			}
		}
		return b;
	}
}