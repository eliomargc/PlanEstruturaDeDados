package vetores.testes;

import java.util.Arrays;

public class Intercalado {

	public static void main(String[] args) {
		int[] a1 = { 5, 15, 0, 1 };
		int[] a2 = { 2, 4, 10, 3 };
		int[] a3 = new int[8];

		int contador = 0;
		for (int i = 0; i < a3.length; i+=2) {
			a3[i] = a1[contador];
			a3[i + 1] = a2[contador];
			contador++;
		}

		System.out.println(Arrays.toString(a3));

	}

}
