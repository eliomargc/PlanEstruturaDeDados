package vetores.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vetores.model.Aluno;

/*
    * Trabalhando a classe ArrayList só aceitando elementos do mesmo tipo
    * Porém mudando um pouco, agora com objetos
*/
public class Exemplo03 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eliomar");
        Aluno aluno2 = new Aluno("Derek");
        Aluno aluno3 = new Aluno("Rafaela");
        Aluno aluno4 = new Aluno("Gal");
        Aluno aluno5 = new Aluno("Mazinho");
        
        //criando o objeto array, e forçando que sejam do mesmo tipo
        ArrayList<Aluno> array = new ArrayList<>();
        array.add(aluno1);
        array.add(aluno2);
        array.add(aluno3);
        array.add(aluno4);
        array.add(aluno5);
        
        System.out.println("Listando o array completo (forma simples):");
        System.out.println(array);
        
        System.out.println("\nListando um array completo (for tradicional):");
        for(int i = 0; i < array.size(); i++){
            System.out.println("Elemento " + i + " = " + array.get(i)); 
        }
         
        System.out.println("\nListando um array completo com (for enhanced):");
        int i=0;
        for(Aluno a : array){
            System.out.println("Elemento " + (i++) + " = " + a); 
        }
        
        System.out.println("\nListando um array completo com interator:");
        Iterator it = array.iterator();
        while(it.hasNext()) {
        	System.out.println("Elemento = " + it.next());
        }
        
        System.out.println("\nPegando apenas um elemento do array: ");
        Aluno elemento = array.get(0);
        System.out.println("toString(): " + elemento); 
        System.out.println("Especificando o valor: " + elemento.getNome()); 
        
        //Removendo um elemento do array
        array.remove(3);
        System.out.println("\nListando o array com elemento de indice 3 removido: ");
        System.out.println(array);
        
        System.out.print("\nListando o novo indice 3 do array (perceba que não é mais o valor Gal): ");
        System.out.println(array.get(3)); 
        
        
        System.out.print("\nVerificando se um dado elemento contem na lista: ");
        //repare que parece que as duas verificações darão true, mas não
        System.out.print(array.contains("Eliomar") + ", ");
        System.out.println(array.contains(new Aluno("Eliomar")));
        
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
