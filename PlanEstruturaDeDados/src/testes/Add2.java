package testes;

import java.util.Arrays;

public class Add2 {

	public static void main(String[] args) {
		int[] array = {1, 10, 30, 40};
		
		int posicaoAdd = 4;
		int valorAdd = 50;
		
		System.out.println(Arrays.toString(array));
		
		int[] arrayNovo = new int[array.length+1];
		
		System.out.println(Arrays.toString(arrayNovo));
		for(int i=array.length-1; i >= 0; i--) {
			if(i >= posicaoAdd) {
				arrayNovo[i+1] = array[i];
			}else {
				arrayNovo[i] = array[i];
			}
			System.out.println(Arrays.toString(arrayNovo));
		}
		arrayNovo[posicaoAdd] = valorAdd;
		
		
		
		
		System.out.println(Arrays.toString(arrayNovo));
		
		
	}

}
