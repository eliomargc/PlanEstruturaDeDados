package vetores.utils;

import java.util.Arrays;

public class MyArrayListStrings implements MyArrayListStringsInterface{
	private String[] vetor;

	public MyArrayListStrings() {
		vetor = new String[0];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(vetor);
	}

	@Override
	public void adicionar(String elemento) {
		int tamanhoAtual = this.vetor.length;
		String[] novoVetor = new String[tamanhoAtual+1];
		//na mão
//		for(int i = 0; i < tamanhoAtual; i++) {
//			novoVetor[i] = this.vetor[i];
//		}
		//através de método
		novoVetor = Arrays.copyOf(this.vetor, tamanhoAtual+1); //copia os elementos do array antigo para o novo
		novoVetor[tamanhoAtual] = elemento; //adiciona na última posição
		this.vetor = novoVetor;
		
	}

	@Override
	public void adicionar(int posicao, String elemento) {
		int tamanhoAtual = this.vetor.length;
		String[] novoVetor = new String[tamanhoAtual+1];
//		for(int i = tamanhoAtual-1; i >= 0; i--) {
//			if(i >= posicao) {
//				novoVetor[i+1] = this.vetor[i]; 
//			}else {
//				novoVetor[i] = this.vetor[i];
//			}
//		}
		
		//apelando pra métodos
		System.arraycopy(this.vetor, 0, novoVetor, 0, posicao+1);//copia os elementos da esquerda
		System.arraycopy(this.vetor, posicao, novoVetor, posicao+1, tamanhoAtual-posicao);//copia os elementos da direita
		
		novoVetor[posicao] = elemento;
		this.vetor = novoVetor;
	}

	@Override
	public String pegar(int posicao) {
		return this.vetor[posicao];
	}

	@Override
	public void remover(int posicao) {
		int tamanhoAtual = this.vetor.length;
		String[] novoVetor = new String[tamanhoAtual-1];
		//na mão
//		for(int i = tamanhoAtual-1; i > 0; i--) {
//			if(i > posicao) {
//				novoVetor[i-1] = this.vetor[i];	
//			}else {
//				novoVetor[i-1] = this.vetor[i-1];	
//			}
//		}
		
		//apelando pra métodos
		System.arraycopy(this.vetor, 0, novoVetor, 0, posicao); //copia os elementos da esquerda
		System.arraycopy(this.vetor, posicao+1, novoVetor, posicao, tamanhoAtual-(posicao+1)); //copia os elementos da direita
		this.vetor = novoVetor;
	}

	@Override
	public boolean contem(String valor) {
		for(int i = 0; i < this.vetor.length; i++) {
			if(valor.equalsIgnoreCase(this.vetor[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int tamanho() {
		return this.vetor.length;
	}

	@Override
	public String[] subLista(String[] lista, int posicaoInicial, int posicaoFinal) {
		// TODO Auto-generated method stub
		return null;
	}
}
