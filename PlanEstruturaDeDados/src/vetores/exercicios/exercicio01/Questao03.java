package vetores.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Escreva um programa de um jogo de cartas, onde primeiro apresenta 5 cartas ao jogador e as posicoes de tais cartas
 * em seguida solicita ao jogador que remova as 5 cartas, uma de cada vez
 * ao final o programa apresenta o novo leque de cartas, na mesma ordem que foram removidas
 * 
 * As cartas do baralho são divididas em quatro naipes: espadas, paus, copas e ouros. 
 * 		Cada naipe possui 13 cartas, sendo elas: Ás, 2, 3, 4, 5, 6, 7, 8, 9, 10, Valete, Rainha e Rei
 */
public class Questao03 {

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
		
		

		System.out.println("Gerando leque de cartas:");
		ArrayList<String> leque = new ArrayList<>(); 
		Random ran = new Random(); 
		int posicao = 0;
		
		for(int i = 0; i < 5; i++) {
			posicao = ran.nextInt(53); 
			if(leque.contains(baralho.get(posicao))) { 
				i--;
			}else {
				leque.add(baralho.get(posicao));
			}
		}
		
		System.out.println("Este é o seu leque de cartas: ");
		for (int j = 0; j < leque.size(); j++) {
			System.out.println(j + 1 + " - " + leque.get(j));
		}
		
		ArrayList<String> cartasJogadas = new ArrayList<>(); 
		posicao = 0;
		int size = leque.size();
		for(int i=0; i < size; i++) {
			posicao = (Integer.parseInt(JOptionPane.showInputDialog("Posição pra jogar?"))) -1; 
			System.out.println("\nCarta Escolhida: " + (posicao+1));
			if(posicao < 0 || posicao >= leque.size()) {
				System.out.println("Posiçao inválida, escolha uma carta válida!"); 
				i--;
			}else {
				cartasJogadas.add(leque.get(posicao));
				leque.remove(posicao);

				System.out.println("Leque de cartas agora: ");
				for (int j = 0; j < leque.size(); j++) {
					System.out.println(j + 1 + " - " + leque.get(j));
				}
				if(leque.size() == 0) {
					System.out.println("=====SEM CARTAS NA MÃO=====");
				}
			}
			
		}
		
		System.out.print("\nCartas jogadas:");
		System.out.println(cartasJogadas);
		
	
	}

}
