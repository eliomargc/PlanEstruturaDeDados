package vetores.estudos;

import java.util.Arrays;

public class RemoverElemento {

	public static void main(String[] args) {
		String array[] = new String[5];
		array[0] = "1";
		array[1] = "10";
		array[2] = "20";
		array[3] = "30";
		array[4] = "40";
		System.out.println(array.hashCode());
		System.out.println(Arrays.toString(array));
		
		//remover sem ajuda de métodos
		String[] arrayNovo = new String[array.length-1];
		int posRemove = 3;
		for(int i = array.length-1; i > 0; i--) {
			if(i > posRemove) {
				arrayNovo[i-1] = array[i];
			}else {
				arrayNovo[i-1] = array[i-1];
			}
		}
		
		System.out.println("\n"+arrayNovo.hashCode());
		System.out.println(Arrays.toString(arrayNovo));
		
		
		
		//remover com ajuda de métodos 
		String[] arrayNovo2 = new String[arrayNovo.length-1];
		posRemove = 3;
		System.arraycopy(arrayNovo, 0, arrayNovo2, 0, posRemove);
		System.arraycopy(arrayNovo, posRemove+1, arrayNovo2, posRemove, arrayNovo.length-(posRemove+1));
		
		System.out.println("\n"+arrayNovo2.hashCode());
		System.out.println(Arrays.toString(arrayNovo2));
		

	}
	
	
	

}
