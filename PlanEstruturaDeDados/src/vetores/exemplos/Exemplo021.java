package vetores.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    * Trabalhando a classe ArrayList só aceitando elementos do mesmo tipo
    * Funcionalidades: 
    * 	sort(), reverse() 
*/
public class Exemplo021 {
    public static void main(String[] args) {
        
        //criando o objeto array, e forçando que sejam do mesmo tipo 
        ArrayList<String> array = new ArrayList<>();
        array.add("Eliomar");
        array.add("Derek");
        array.add("Rafaela");
        array.add("Maria");
        array.add("Ana");
        
        System.out.println("Array Original:");
        System.out.println(array);
        
        Collections.sort(array); 
        System.out.println("\nArray Ordenado A-Z:");
        System.out.println(array);
        
        Collections.reverse(array); 
        System.out.println("\nArray Ordenado Z-A:");
        System.out.println(array);
        
        System.out.println("\n\n=========== COM INTEIROS ===========");
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(5);
        array2.add(3);
        array2.add(1);
        array2.add(0);
        array2.add(10);
        
        System.out.println("Array2 Original:");
        System.out.println(array2);
        
        Collections.sort(array2); 
        System.out.println("\nArray2 Ordenado A-Z:");
        System.out.println(array2);
        
        Collections.reverse(array2); 
        System.out.println("\nArray2 Ordenado Z-A:");
        System.out.println(array2);
        
        
    }
}
