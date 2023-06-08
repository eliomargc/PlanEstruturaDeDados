//https://blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre/

package vetores.estudos;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] vetor = {3,1,0};
		
		int contador =0;
		for(int i = 0; i < vetor.length-1; i++) {
			for(int j = i+1; j < vetor.length; j++){
				if(vetor[i] > vetor[j]) {
					int iSave = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = iSave;
				}
				contador++;
			}
		}
		System.out.println("Desempenho: " + contador);
		
		
		//menos Eficiente
//		for(int i = 0; i < vetor.length-1; i++) {
//			for(int j = i+1; j < vetor.length; j++){
//				if(vetor[i] > vetor[j]) {
//					int iSave = vetor[i];
//					vetor[i] = vetor[j];
//					vetor[j] = iSave;
//				}
//				contador++;
//			}
//		}
//		System.out.println("Contador 1: " + contador);
		
		
		
		//melhorando o menos eficiente
//		boolean trocado;
//		do{
//			trocado = false;
//			for(int j = 0; j < vetor.length-1; j++){
//				if(vetor[j] > vetor[j+1]) {
//					int iSave = vetor[j];
//					vetor[j] = vetor[j+1];
//					vetor[j+1] = iSave;
//					trocado=true;
//				}
//				contador++;				
//			}
//		}while(trocado);
//		
//		System.out.println("Contador 1: " + contador);
		
		System.out.println(Arrays.toString(vetor));
	}
}
