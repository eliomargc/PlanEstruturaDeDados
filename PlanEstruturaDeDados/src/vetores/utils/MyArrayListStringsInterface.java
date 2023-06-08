package vetores.utils;

public abstract interface MyArrayListStringsInterface {
	public void adicionar(String elemento);
	public void adicionar(int posicao, String elemento);
	public String pegar(int posicao);
	public void remover(int posicao);
	public boolean contem(String valor);
	public int tamanho();
	public String[] subLista(String[] lista, int posicaoInicial, int posicaoFinal);
	
}
