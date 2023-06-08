package vetores.utils;

import java.util.Arrays;

public class MyArrayListGenerics<T> implements MyArrayListGenericsInterface<T>{

	private Object[] vetor;

	public MyArrayListGenerics() {
		this.vetor = new Object[0];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(vetor);
	}

	@Override
	public void adicionar(T elemento) {
		int tamanhoAtual = this.vetor.length;
		Object[] novoVetor = new Object[tamanhoAtual+1];
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
	public void adicionar(int posicao, T elemento) {
		int tamanhoAtual = this.vetor.length;
		Object[] novoVetor = new Object[tamanhoAtual+1];
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
	public T pegar(int posicao) {
		return (T) this.vetor[posicao]; 
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
	public boolean contem(T valor) {
		for(int i = 0; i < this.vetor.length; i++) {
			if(valor.equals(this.vetor[i])) {
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
	public T[] subLista(T[] lista, int posicaoInicial, int posicaoFinal) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
