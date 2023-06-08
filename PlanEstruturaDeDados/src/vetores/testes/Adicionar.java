package vetores.testes;

import java.util.Arrays;
import java.util.Iterator;

public class Adicionar {

	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 10;
		array[2] = 30;
		array[3] = 40;
		
		int[] novoArray = new int[5];
		
		int posAdd = 0;
		int valorAdd = 20;
		
		for(int i=array.length-1; i >= 0; i--) {
			if(i >= posAdd) {
				novoArray[i+1] = array[i];
			}else {
				novoArray[i] = array[i]; 
			}
		}
		
		novoArray[posAdd] = valorAdd;
		
		System.out.println(Arrays.toString(novoArray));
		
	}
}
