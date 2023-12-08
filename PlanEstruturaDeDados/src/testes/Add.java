package testes;

import java.util.Arrays;

public class Add {
	
	public static void main(String[] args) {
		int[] array = new int[10];
		array[0] = 1;
		array[1] = 10;
		array[2] = 30;
		array[3] = 40;
		
		System.out.println(Arrays.toString(array));
		
		int posicaoAdd = 2;
		int valorAdd = 20;
		int posicaoUltimo = 3;
			
		//SE conhecer a posição do ultimo elemento...
		for(int i=posicaoUltimo; i >= posicaoAdd; i--) {
			array[i+1] = array[i];
			System.out.println(Arrays.toString(array));
		}
		array[posicaoAdd] = valorAdd;
		System.out.println(Arrays.toString(array));
		
		
		//ou se não conhecer a posição do ultimo...
		for(int i=array.length-1; i >= posicaoAdd; i--) {
			array[i] = array[i-1];
			System.out.println(Arrays.toString(array));
		}
		array[posicaoAdd] = valorAdd;
		System.out.println(Arrays.toString(array));

	}
	


}
