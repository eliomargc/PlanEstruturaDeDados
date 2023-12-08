package vetores.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vetores.model.Aluno;

/*
    * Trabalhando a classe ArrayList só aceitando elementos do mesmo tipo
    * Porém mudando um pouco, agora com objetos
    * Funcionalidades: 
    * 	sort(), reverse() 
*/
public class Exemplo031 {
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
        
        System.out.println("Array Original:");
        System.out.println(array);
        
        Collections.sort(array); 
        System.out.println("\nArray Ordenado A-Z:");
        System.out.println(array);
        
        Collections.reverse(array); 
        System.out.println("\nArray Ordenado Z-A:");
        System.out.println(array);
    }
}
