package vetores.avaliacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		ArrayList<Integer> vetorGeral = new ArrayList<>();
		ArrayList<Integer> vetorPar = new ArrayList<>();
		ArrayList<Integer> vetorImpar = new ArrayList<>();
	
		int valor;
		Scanner in = new Scanner(System.in); 
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Valor: ");
			valor = in.nextInt();
			vetorGeral.add(valor);
			if(valor % 2 == 0) {
				vetorPar.add(valor);
			}else {
				vetorImpar.add(valor);
			}
		}
		
		System.out.println(vetorGeral);
		System.out.println(vetorPar);
		System.out.println(vetorImpar);
	}

}
