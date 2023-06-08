package vetores.estudos;

import java.util.Arrays;

public class AdicionarElemento {

	public static void main(String[] args) {
		String array[] = new String[5];
		array[0] = "1";
		array[1] = "10";
		array[2] = "20";
		array[3] = "30";
		array[4] = "40";
		System.out.println(array.hashCode());
		System.out.println(Arrays.toString(array));
		
		//adicionar no final
		String valor = "50";
		String array2[] = new String[6]; //prepara o novo tamanho (não precisa pois copyOfRange já cria uma nova instancia
		array2 = Arrays.copyOfRange(array, 0, 6); //copia os elementos antigos
		//array = Arrays.copyOf(array, 6); //pode ser assim também
		array2[array2.length-1] = valor; //adiciona o novo elemento ao final
		System.out.println("\n"+array2.hashCode());
		System.out.println(Arrays.toString(array2));
		//ou pode usar o for percorrendo todos e copiando para a nova lista
		
		
		//adicionando no meio
		valor = "5";
		int posicao = 1;
		String[] array3 = new String[7];
		for(int i = 0; i < array2.length; i++) {
			if(i >= posicao) {
				array3[i+1] = array2[i];
			}else {
				array3[i] = array2[i]; 
			}
		}
		array3[posicao] = valor;
		System.out.println(Arrays.toString(array3));
		
		

	}
	
	
	

}
