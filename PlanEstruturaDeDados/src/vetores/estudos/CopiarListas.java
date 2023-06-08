package vetores.estudos;

import java.util.ArrayList;
import java.util.List;

public class CopiarListas {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Eliomar");
		lista.add("Derek"); 
		lista.add("Rafaela");
		lista.add("Teste"); 
		lista.add("10");
		
		//copiando uma lista com o mesmo endereco de memoria
		List<String> lista2 = lista;
		
		//Duplicando uma lista com enderecos de memoria diferentes 
		//Atenção: começam iguais, porém, ao relizar alguma modificação em qualquer uma das listas, mudam o endereço de memoria
		List<String> lista3 = new ArrayList<>(lista); 
		lista2.add("ad");
		System.out.println(lista.hashCode() + " = " + lista);
		System.out.println(lista2.hashCode() + " = " + lista2); 
		System.out.println(lista3.hashCode() + " = " + lista3);
		
		//copiando parte de uma lista para outra
		//não usamos o subList diretamente
		ArrayList<String> lista4 = new ArrayList<>(lista.subList(0, 3)); 
		lista4.add("novo");
		System.out.println(lista4.hashCode() + " = " + lista4);
		

	}

}
