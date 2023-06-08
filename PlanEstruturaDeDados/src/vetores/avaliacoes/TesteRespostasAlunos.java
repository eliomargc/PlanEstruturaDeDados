package vetores.avaliacoes;

import java.util.Arrays;
import java.util.Scanner;

public class TesteRespostasAlunos {

	public static void main(String[] args) {
		Integer[] listaNum = new Integer[10];
		Integer[] listaPar = new Integer[10];
		Integer[] listaImpar = new Integer[10];

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os 10 Números");
		for (int i = 0; i < listaNum.length; i++) {
			int numeros = scan.nextInt();
			listaNum[i] = numeros;
		}

		for (int j = 0; j < listaNum.length; j++) {
			if (listaNum[j] % 2 == 0) {
				listaPar[j] = listaNum[j];
			} else {
				listaImpar[j] = listaNum[j];
			}
		}

		System.out.println("Lista Geral: " + Arrays.toString(listaNum));
		System.out.println("Lista Pares: " + Arrays.toString(listaPar));
		System.out.println("Lista Impares: " + Arrays.toString(listaImpar));

	}

}
