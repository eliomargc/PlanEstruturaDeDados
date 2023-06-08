package vetores.avaliacoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		int[] vetorGeral = new int[5];
		int[] vetorPar = new int[5];
		int[] vetorImpar = new int[5];
		int valor;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		Scanner in = new Scanner(System.in); 
		for (int i = 0; i < 5; i++) {
			System.out.print("Valor: ");
			valor = in.nextInt();
			vetorGeral[i] = valor;
			if(valor % 2 == 0) {
				vetorPar[contadorPar] = valor;
				contadorPar++;
			}else {
				vetorImpar[contadorImpar] = valor;
				contadorImpar++;
			}
		}
		
		System.out.println("Lista Geral: "+Arrays.toString(vetorGeral));
		System.out.println("Lista Pares: "+Arrays.toString(vetorPar));
		System.out.println("Lista Impares: "+Arrays.toString(vetorImpar));
	}

}
