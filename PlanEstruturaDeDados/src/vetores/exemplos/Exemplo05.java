package vetores.exemplos;

import java.util.Arrays;

/*
    * No exemplo04, nós declaramos, inicializamos, inserimos, e listamos/pegamos de forma normal e também com for 
    * Aqui iremos trabalhar o problema de adicionar um elemento em uma posição que já existe elemento, ou seja, no meio da lista, e também ao final (mais fácil)
    * Ao final, o aluno irá perceber que existe uma necessidade de ter uma classe já preparada com tais controles da lista
 */
public class Exemplo05 {

	static String[] lista = new String[4];

	public static void main(String[] args) {
		lista[0] = "a";
		lista[1] = "b";
		lista[2] = "d";
		lista[3] = "e";

		System.out.println("Array começando dessa forma: ");
		System.out.println(Arrays.toString(lista));

		// Inserindo elemento no meio do Array já preenchido
		int posicaoInserir = 2;
		String valor = "c";
		inserirElemento(posicaoInserir, valor);

		System.out.println("\nCom elemento adicionado no meio ficou dessa forma: ");
		System.out.println(Arrays.toString(lista));

		inserirElemento("f");
		System.out.println("\nCom elemento adicionado normal ao final, ficou dessa forma: ");
		System.out.println(Arrays.toString(lista));
	}

	static void inserirElemento(int posicaoInserir, String valor) {
		String[] novaLista = new String[lista.length + 1];

		// com dois For
//        for (int i = 0; i < posicaoInserir; i++) {
//            novaLista[i] = lista[i];
//        }
//        for (int i = lista.length - 1; i >= posicaoInserir; i--) {
//            novaLista[i + 1] = lista[i];
//        }

		// com um for só
		for (int i = 0; i < lista.length; i++) {
			if (i < posicaoInserir) {
				novaLista[i] = lista[i];
			} else {
				novaLista[i + 1] = lista[i];
			}
		}

		novaLista[posicaoInserir] = valor;
		lista = novaLista;
	}

	private static void inserirElemento(String valor) {
		//mais difícil
//        String[] novaLista = new String[lista.length + 1];
//        for(int i = 0; i < lista.length; i++){
//            novaLista[i] = lista[i];
//        }
//    	novaLista[lista.length] = valor;
//        lista = novaLista;
		
		//mais fácil
		lista = Arrays.copyOf(lista, lista.length+1);
		lista[lista.length-1] = valor;
	}

}
