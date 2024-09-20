/*
Entrega a Atividade 2 - Algoritmos e Programação II

Nós,

Bruno Henrique Gouveia Da Silva
Lucas Vasconcelos de Oliveira Nunes Bento

declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner ler = new Scanner(System.in);

    // nome do arquivo
    System.out.print("Nome do Arquivo: ");
    String nomeArquivo = ler.nextLine();

    File arquivos = new File(nomeArquivo);
    Scanner entrada = new Scanner(arquivos);

    String linha;
    String[] palavra = null;
    String[] dicionario = new String[1000];
    int ctd = 0;

    while (entrada.hasNextLine()) {

      linha = entrada.nextLine();

      if (linha.length() > 0) {
        
        palavra = linha.split(" ");

        for (int i = 0; i < palavra.length; i++) {

          palavra[i] = palavra[i].toLowerCase();

          // verifica se existe a palavra no vetor
          if (buscaBinaria(dicionario, palavra[i], ctd) != true) {
            
            // se não existe insere no dicionario
            dicionario[ctd] = palavra[i];

            //ordena a ultima palavra inserida
            insertionSort(dicionario,ctd);
            ctd++;
          }
        }
      }
    }

    imprimir(dicionario,ctd); 
  }

  // busca binaria para saber se existe a palavra no dicionario
  public static boolean buscaBinaria(String[] vetor, String plvrProcurar, int ctdr) {
    int inicio = 0, fim = ctdr - 1, meio;

    while (inicio <= fim) {
      meio = (inicio + fim) / 2;
      if (vetor[meio].compareTo(plvrProcurar) == 0) {
        return true;
      }
      if (vetor[meio].compareTo(plvrProcurar) < 0) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }
    return false;
  }
  // imprimir as palavras do dicionario
  public static void imprimir(String[] dicionario,int ctd) {
    for (int i = 0; i < dicionario.length; i++) {
      if (dicionario[i] != null) {
        System.out.println(dicionario[i]);
      } else {
        break;
      }
    }
     System.out.println("Total de palavras diferentes no dicionario: " + ctd);
  }
  // ordenar por metodo insertion Sort
  public static void insertionSort(String[] dicionario,int ctd){
    int k = ctd;
    String aux = dicionario[k];

    while (k > 0 && dicionario[k - 1].compareTo(aux) > 0) {
      dicionario[k] = dicionario[k - 1];
      k--;
    }
    dicionario[k] = aux;
  }
}