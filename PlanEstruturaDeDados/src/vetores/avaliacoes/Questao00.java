package vetores.avaliacoes;

import java.util.Random;

public class Questao00 {

	public static void main(String[] args) {
		
		int[] valores = new int[20];
		Random random = new Random();
		int valorSorteado;
		
		//sorteia os valores de 1 a 6, e adiciona no array 20 vezes
		for(int i=0; i<20; i++) {
			valorSorteado = random.nextInt(1,7); //sorteia de 1 a 6
			valores[i] = valorSorteado;
		}
		
		//lista os 20 valores do array
		for(int i=0; i<20; i++) {
			System.out.print(valores[i] + ", "); 
		}
	}
}

