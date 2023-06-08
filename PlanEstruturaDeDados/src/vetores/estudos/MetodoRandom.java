package vetores.estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

public class MetodoRandom {

	public static void main(String[] args) {
		Random ran = new Random(); 
		ArrayList<Integer> cartas = new ArrayList<>();
		int posicao = 0;
		int contador = 0;
		for(int i = 0; i < 54; i++) {
			contador++;
			posicao = ran.nextInt(54)+1; 
			if(cartas.contains(posicao)) {
				i--;
			}else {
				cartas.add(posicao);
			}
		}
		System.out.println(contador + " vezes!");
		
		for(int i = 0; i < 54; i++) {
			System.out.println(cartas.get(i));
		}
		
		Collections.sort(cartas);
		System.out.println(cartas);
		
		//Pode ser também através da classe LinkedHashSet
//		Random random = new Random();
//        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//        while (set.size() < 54) {
//            set.add(random.nextInt(54)+1);
//        }
//        System.out.println("10 random non-repeating numbers: " + set);

	}

}
