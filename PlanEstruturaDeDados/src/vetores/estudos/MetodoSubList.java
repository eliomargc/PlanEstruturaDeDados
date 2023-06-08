package vetores.estudos;

import java.util.ArrayList;
import java.util.List;

/*
 * O método subList() da classe java.util.ArrayList é usado para retornar uma visualização 
 * da parte desta lista entre o fromIndex, inclusive, e toIndex, exclusivo especificado. 
 * Se fromIndex e toIndex forem iguais, a lista retornada estará vazia.)

	A lista retornada é apoiada por esta lista, portanto, as mudanças não estruturais na lista 
	retornada são refletidas nesta lista e vice-versa. A lista retornada suporta todas as operações de lista opcionais.
 */
public class MetodoSubList {

	public static void main(String[] args) {
		//criando o objeto array, e forçando que sejam do mesmo tipo 
        ArrayList<String> array = new ArrayList<>();
        array.add("Eliomar");
        array.add("Derek");
        array.add("Rafaela");
        array.add("Teste");
        array.add("10");
        
        //Valor de retorno: este método retorna uma visão do intervalo especificado nesta lista.
        List novoArray = array.subList(0, 0);

	}

}
