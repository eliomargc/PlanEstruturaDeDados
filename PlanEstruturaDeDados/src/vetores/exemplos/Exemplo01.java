package vetores.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vetores.model.Aluno;

/*
    * Trabalhando a classe ArrayList com elementos de vários tipos
    * Funcionalidades: 
    * 		add(), toString(), for(), append(), for() enhanced, casting, remove(), 
    * 		contains(), sublist(), clear()
*/
public class Exemplo01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eliomar");
        
        //Adicionar elementos diversos no vetor
        ArrayList array = new ArrayList(100);
        array.add(aluno1);
        array.add(50.2);
        array.add(10);
        array.add("Derek");
        array.add(true);
        //outra forma de adicionar elementos no array
        //array.addAll(Arrays.asList(aluno1,aluno2,aluno3));
        
        
        System.out.println("Listando o array completo (forma simples):");
        System.out.println(array.toString());
        
        
        System.out.println("\nListando um array completo (for tradicional) pelo índice:");
        StringBuilder sb = new StringBuilder();
        sb.append("[");  
        for(int i = 0; i < array.size(); i++){
            sb.append(array.get(i)); 
            if(i < array.size()-1) 
                sb.append(", "); 
        }
        sb.append("]");
        System.out.println(sb);

               
        System.out.println("\nListando um array completo (for tradicional) pelo índice:");
        for(int i = 0; i < array.size(); i++){
            System.out.println("Elemento " + i + " = " + array.get(i)); 
        }
        
        
        System.out.println("\nListando um array completo com (for enhanced):");
        int i=0;
        for(Object o : array){
            System.out.println("Elemento " + (i++) + " = " + o); 
        }
        
        System.out.println("\nListando um array completo com interator:");
        Iterator it = array.iterator();
        while(it.hasNext()) {
        	System.out.println("Elemento = " + it.next());
        }
        
         
        //tem que ter cuidado ao fazer um casting com array de elementos mistos
        System.out.print("\nPegando um elemento do array e fazendo casting: ");
        Aluno a = (Aluno) array.get(0);
        System.out.println(a.getNome());
        
        //Removendo um elemento do array
        array.remove(3);
        System.out.println("\nListando o array com elemento de indice 3 removido: ");
        System.out.println(array);
        
        System.out.print("\nListando o novo indice 3 do array (perceba que não é mais o valor Teste): ");
        System.out.println(array.get(3)); 
        
        
        System.out.print("\nVerificando se um dado elemento contem na lista: ");
        //repare que parece que as duas verificações darão true, mas não
        System.out.print(array.contains(10) + ", ");
        System.out.println(array.contains("10"));
        
        System.out.println("\nCopiando uma parte da lista para uma subLista: ");
        List subLista = array.subList(0, 3);
        System.out.println(subLista);
        
        //com o subList(), se apagar os elementos da lista original, será refletido na sublista que gera um erro
        //ou seja, a sublista é dependente da lista original
        System.out.print("\nApagando todos os elementos da sublista: ");
        subLista.clear();
        System.out.println(subLista);
        System.out.println("Perceba que apagou também da lista original: " + array);
        
        //por essa possível indesejável situação, melhor copiar os elementos de outro forma:
        ArrayList subLista2 = new ArrayList(array); 
        array.clear(); // perceba que mesmo apagando a lista original, não refletirá na sublista copiada
        System.out.println("Lista Original apagada: " + array);
        System.out.println("Lista Copiada da original não se altera: " + subLista2);
        
        
    }
}
