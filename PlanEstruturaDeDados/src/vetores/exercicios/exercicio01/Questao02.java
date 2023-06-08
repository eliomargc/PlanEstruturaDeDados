package vetores.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Questao02 {

	public static void main(String[] args) {
		ArrayList<String> naipes = new ArrayList<>();
		naipes.addAll(Arrays.asList("Espadas", "Copas", "Paus", "Ouros")); 
		
		ArrayList<String> valores = new ArrayList<>();
		valores.addAll(Arrays.asList("Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"));  
		
		ArrayList<String> baralho = new ArrayList<>();
		for(String naipe : naipes) {
			for(String valor : valores) {
				baralho.add(valor + " de " + naipe );
			}
			
		}
		
		for(String carta : baralho) {
			System.out.println("------------------");
			System.out.println(carta);
		}
		 
		System.out.println("\n\n***************  EMBARALHADO  ***************");
		Random random = new Random(); 
		ArrayList<String> cartasEmbaralhadas = new ArrayList<>();
		String carta;
		while(cartasEmbaralhadas.size() < baralho.size()) {
			carta = baralho.get(random.nextInt(52)); 
			if(!cartasEmbaralhadas.contains(carta)) { 
				cartasEmbaralhadas.add(carta);
			}
		}
		
		for(String car : cartasEmbaralhadas) {
			System.out.println("------------------");
			System.out.println(car);
		}

	}

}
