package vetores.utils;

//é necessário extender MyIterable pra que seja uma interface funcional e assim conseguir usar Lambda no myforeach
public interface MyArrayListGenericsInterface<T> extends MyIterable { 
	public void adicionar(T elemento);

	public void adicionar(int posicao, T elemento);

	public T pegar(int posicao);

	public void remover(int posicao);

	public boolean contem(T valor);

	public int tamanho();

	public T[] subLista(T[] lista, int posicaoInicial, int posicaoFinal);

}
