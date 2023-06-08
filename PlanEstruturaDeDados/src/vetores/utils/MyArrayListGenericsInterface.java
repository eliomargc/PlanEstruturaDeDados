package vetores.utils;

public interface MyArrayListGenericsInterface<T> {
	public void adicionar(T elemento);

	public void adicionar(int posicao, T elemento);

	public T pegar(int posicao);

	public void remover(int posicao);

	public boolean contem(T valor);

	public int tamanho();

	public T[] subLista(T[] lista, int posicaoInicial, int posicaoFinal);

}
