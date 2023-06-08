package vetores.testes;

import java.util.Arrays;

public class Remover {

	public static void main(String[] args) {
		int[] array = new int[5]; 
		array[0] = 1;
		array[1] = 10;
		array[2] = 20;
		array[3] = 30;
		array[4] = 40;
		
		int[] novoArray = new int[4];
		
		int posRemover = 2;
		
		for(int i=array.length-1; i > 0; i--) {
			if(i > posRemover) {
				novoArray[i-1] = array[i];
			}else{
				novoArray[i-1] = array[i-1]; 
			}
		}
		
		System.out.println(Arrays.toString(novoArray));
	}
}


