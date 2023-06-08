package vetores.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> cofrinho = new ArrayList<>();
		
		System.out.print("Quantas moedas deseja depositar? "); 
		int qtdMoedas = input.nextInt();
		System.out.println("certo...");
		for(int i = 0; i < qtdMoedas; i++) {
			System.out.print("Digite moeda " + i + ": ");
			cofrinho.add(input.nextDouble()); 
		}
		
		double total = 0;
		for(double valor : cofrinho) {
			total +=valor;
		}
		
		System.out.println("Total atual do cofre: " + total);

	}

}
