package testes;

import java.util.Arrays;

public class Add3 {

	private static int[] array = new int[0];

	public static void main(String[] args) {
		System.out.println(Arrays.toString(array));

		add(1);
		add(10);
		add(30);
		add(40);
		System.out.println(Arrays.toString(array)); 
		
		add(0, 100);
		System.out.println(Arrays.toString(array)); 
		
		remove(10);
		System.out.println(Arrays.toString(array)); 
		
	}
	
	public static void remove(int pos) {
		int tamanhoAtual = array.length;
		int[] copy = new int[tamanhoAtual - 1];
		
		for(int i = tamanhoAtual-1; i > 0; i-- ) {
			if(i > pos) {
				copy[i-1] = array[i];
			}else {
				copy[i-1] = array[i-1];
			}
		}
		array = copy;	
	}
	
	public static void add(int indice,int elemento) {
		int tamanhoAtual = array.length;
		int[] copy = new int[tamanhoAtual + 1];
		
		for (int i = tamanhoAtual-1; i >= 0; i--) {
			if(i >= indice) {
				copy[i+1] = array[i];		
			}else {
				copy[i] = array[i];
			}
		}
		copy[indice] = elemento;
		array = copy;	
	}

	public static void add(int elemento) {
		int tamanhoAtual = array.length;
		int[] copy = new int[tamanhoAtual + 1];

		for (int i = 0; i < tamanhoAtual; i++) {
			copy[i] = array[i];
		}
		copy[tamanhoAtual] = elemento;
		array = copy;
	}

}
