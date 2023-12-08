package testes;

public class Add4 {

	public static void main(String[] args) {
		MyArrayList lista = new MyArrayList();
		
		System.out.println(lista);
		
		lista.add(100);
		lista.add(50);
		System.out.println(lista);
		
		
		
		for(int i : lista.getArray()) {
			System.out.println("" + i);
		}

	}

}
