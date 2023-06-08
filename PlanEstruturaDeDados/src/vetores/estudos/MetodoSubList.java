package vetores.estudos;

import java.util.ArrayList;
import java.util.List;

/*
 * O m�todo subList() da classe java.util.ArrayList � usado para retornar uma visualiza��o 
 * da parte desta lista entre o fromIndex, inclusive, e toIndex, exclusivo especificado. 
 * Se fromIndex e toIndex forem iguais, a lista retornada estar� vazia.)

	A lista retornada � apoiada por esta lista, portanto, as mudan�as n�o estruturais na lista 
	retornada s�o refletidas nesta lista e vice-versa. A lista retornada suporta todas as opera��es de lista opcionais.
 */
public class MetodoSubList {

	public static void main(String[] args) {
		//criando o objeto array, e for�ando que sejam do mesmo tipo 
        ArrayList<String> array = new ArrayList<>();
        array.add("Eliomar");
        array.add("Derek");
        array.add("Rafaela");
        array.add("Teste");
        array.add("10");
        
        //Valor de retorno: este m�todo retorna uma vis�o do intervalo especificado nesta lista.
        List novoArray = array.subList(0, 0);

	}

}
