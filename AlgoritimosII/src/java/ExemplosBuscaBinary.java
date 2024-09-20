import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ExemplosBuscaBinary {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int[] vetor = criarVetor(10);
    Arrays.sort(vetor);
    int[] vetordecre = criarVetor(10);
    vetordecrecente(vetordecre);

    for (int i : vetor) {
      System.out.print(i + "|");
    }
     System.out.println();
    for (int i : vetordecre) {
      System.out.print(i + "|");
    }

    System.out.println();
    System.out.println("informe o numero:");
    int num = ler.nextInt();
    System.out.println("informe o numero:");
    int num1 = ler.nextInt();

    int pos = buscaBinaria(vetor, num);
    int posDecrecente = buscaBinariaDecrecente(vetordecre, num1);

    if (pos == -1) {
      System.out.println("O numero nao foi encontrado");
    } else {
      System.out.println("o numero esta na posicao " + pos);
    }

    if (posDecrecente == -1) {
      System.out.println("O numero nao foi encontrado");
    } else {
      System.out.println("o numero esta na posicao " + posDecrecente + " na busca decrecente");
    }

  }

  public static int[] criarVetor(int tm) {
    Random aleatorio = new Random();
    int[] vetor = new int[tm];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(100);
    }
    return vetor;
  }

  public static int buscaBinaria(int[] vetor, int valorProcurado) {

    int inicio = 0;
    int fim = vetor.length - 1;
    int meio;

    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (vetor[meio] == valorProcurado) {
        return meio;
      } else if (valorProcurado < vetor[meio]) {
        fim = meio - 1;
      } else {
        inicio = meio + 1;
      }
    }
    return -1;
  }

  public static int buscaBinariaDecrecente(int[] vetor, int valorProcurado) {
    int inicio = 0;
    int fim = vetor.length - 1;
    int meio;

    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (vetor[meio] == valorProcurado) {
        return meio;
      } else if (valorProcurado < vetor[meio]) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }
    return -1;
  }

  public static void vetordecrecente(int[] vetor) {
    for (int i = 1; i < vetor.length; i++) {
      for (int j = 0; j < i; j++) {
        if (vetor[i] > vetor[j]) {
          int temp = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = temp;
        }
      }
    }
  }
  
}