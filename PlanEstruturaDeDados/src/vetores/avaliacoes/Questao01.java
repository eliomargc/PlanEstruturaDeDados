package vetores.avaliacoes;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		String[] equipe1 = new String[5];
		String[] equipe2 = new String[5];

		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Digite nome Equipe 1: ");
		String nomeEquipe1 = in.nextLine(); 

		System.out.print("Digite nome Equipe 2: ");
		String nomeEquipe2 = in.nextLine(); 
		
		System.out.println("\n==== Cadastre os jogadores do "+ nomeEquipe1 +" ====");
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite nome jogador " + (i+1) + ": ");
			equipe1[i] = in.nextLine();
		}
		
		System.out.println("\n==== Cadastre os jogadores do "+ nomeEquipe2 +" ====");
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite nome jogador " + (i+1) + ": ");
			equipe2[i] = in.nextLine();
		}

		System.out.println("\n\nLista do " + nomeEquipe1 + ": ");
		for (int i = 0; i < 3; i++) {
			System.out.print(equipe1[i] + ", ");
		}

		System.out.println("\n\nLista do " + nomeEquipe2 + ": ");
		for (int i = 0; i < 3; i++) {
			System.out.print(equipe2[i] + ", ");
		}
	}

}
