package testes;

import java.util.Arrays;

public class MyArrayList {
	
	private int[] array;
	
	public MyArrayList() {
		this.array = new int[0];
	}
	
	public void remove(int pos) {
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
	
	public void add(int indice,int elemento) {
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

	public void add(int elemento) {
		int tamanhoAtual = array.length;
		int[] copy = new int[tamanhoAtual + 1];

		for (int i = 0; i < tamanhoAtual; i++) {
			copy[i] = array[i];
		}
		copy[tamanhoAtual] = elemento;
		array = copy;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	public int[] getArray() {
		return array;
	}
	

}
