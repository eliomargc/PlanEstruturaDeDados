//ARTIGO: https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java

package vetores.exemplos;

import java.util.Arrays;
import java.util.Collections;

import vetores.model.Aluno;

/*
    * Depois de termos visto que a classe ArrayList já implementa os métodos de manipulação do vetor
    * Iremos trabalhar agora a implementação dos nossos próprios métodos 
    * Mas antes disso, vamos aprender como trabalhar com o tipo array da forma mais primitiva 
    * Aqui nesse exemplo04, por enquanto, apenas declarando, inicializando, inserindo, e listando normal e com for 
*/
public class Exemplo04 {
    public static void main(String[] args) {
        //Declarando e inicializando um vetor com 10 espaços sem elementos
        int[] vetorDeInteiros = new int[10];
        String[] vetorDeStrings = new String[10];
        Aluno[] vetorDeObjetos = new Aluno[10];
        Object[] vetorDeDiversos = new Object[10];
        boolean[] vetorDeBooleans = new boolean[10];
        
        System.out.println("Imprimindo array de INTEIROS vazios: "+Arrays.toString(vetorDeInteiros)); 
        System.out.println("Imprimindo array de STRINGS vazias: "+Arrays.toString(vetorDeStrings)); 
        System.out.println("Imprimindo array de OBJETOS vazios: "+Arrays.toString(vetorDeObjetos)); 
        System.out.println("Imprimindo array de DIVERSOS vazios: "+Arrays.toString(vetorDeDiversos)); 
        System.out.println("Imprimindo array de BOOLEANS vazios: "+Arrays.toString(vetorDeBooleans)); 
        System.out.println("---------------------------------------------------------------------------------------");
        
        //Declarando e inicializando um vetor já com elementos inseridos
        int[] vetorDeInteiros2 = {1, 20, 10, 5, 30}; // new int[]{1, 20, 10, 5, 30};
        String[] vetorDeStrings2 = {"Eliomar", "Derek", "Rafaela"}; // new String[]{"Eliomar", "Derek", "Rafaela"}
        Aluno[] vetorDeObjetos2 = {new Aluno("Maria"), new Aluno("José") }; 
        Object[] vetorDeDiversos2 = {"João", 10, true, 5.5, new Aluno("Fulano")};
        boolean[] vetorDeBooleans2 = {true, false, false, true, true};
        
        System.out.println("Imprimindo array de INTEIROS com valores: "+Arrays.toString(vetorDeInteiros2)); 
        System.out.println("Imprimindo array de STRINGS com valores: "+Arrays.toString(vetorDeStrings2)); 
        System.out.println("Imprimindo array de OBJETOS com valores: "+Arrays.toString(vetorDeObjetos2)); 
        System.out.println("Imprimindo array de DIVERSOS com valores: "+Arrays.toString(vetorDeDiversos2)); 
        System.out.println("Imprimindo array de BOOLEANS com valores: "+Arrays.toString(vetorDeBooleans2)); 
        System.out.println("---------------------------------------------------------------------------------------");

        
        //inserindo valores em posições específicas
        int[] vetorDeInteiros3 = new int[10];
        vetorDeInteiros3[0] = 1;
        vetorDeInteiros3[5] = 50;
        vetorDeInteiros3[9] = 800;
        
        String[] vetorDeStrings3 = new String[10];
        vetorDeStrings3[0] = "Maria";
        vetorDeStrings3[9] = "José";
        vetorDeStrings3[2] = "João";
        
        Aluno[] vetorDeObjetos3 = new Aluno[10];
        vetorDeObjetos3[1] = new Aluno("Teste");
        vetorDeObjetos3[3] = new Aluno();
        vetorDeObjetos3[9] = new Aluno("Eliomar");
        
        Object[] vetorDeDiversos3 = new Object[10];
        vetorDeDiversos3[0] = "Teste de string";
        vetorDeDiversos3[1] = 10;
        vetorDeDiversos3[2] = true;
        vetorDeDiversos3[3] = new Aluno("Teste objeto aluno");
        
        boolean[] vetorDeBooleans3 = new boolean[10];
        vetorDeBooleans3[0] = true;
        vetorDeBooleans3[1] = true;
        vetorDeBooleans3[3] = true; 
        
        System.out.println("Imprimindo valores INTEIROS inseridos em posições específicas: "+Arrays.toString(vetorDeInteiros3)); 
        System.out.println("Imprimindo valores STRINGS inseridos em posições específicas: "+Arrays.toString(vetorDeStrings3)); 
        System.out.println("Imprimindo valores OBJETOS inseridos em posições específicas: "+Arrays.toString(vetorDeObjetos3)); 
        System.out.println("Imprimindo valores DIVERSOS inseridos em posições específicas: "+Arrays.toString(vetorDeDiversos3)); 
        System.out.println("Imprimindo valores BOOLEANS inseridos em posições específicas: "+Arrays.toString(vetorDeBooleans3)); 
        System.out.println("---------------------------------------------------------------------------------------");
       
        System.out.print("Imprimindo array de INTEIROS através do For enhanced: "); 
        for(int i : vetorDeInteiros3){
            System.out.print(i + ", ");
        }
        
        
        System.out.print("\nImprimindo array de STRINGS através do For enhanced: ");
        for(String i : vetorDeStrings3){
            System.out.print(i + ", ");
        }
        
        
        System.out.print("\nImprimindo array de OBJETOS através do For enhanced: "); 
        for(Aluno i : vetorDeObjetos3){
            System.out.print(i + ", ");
        }
        
        System.out.print("\nImprimindo array de DIVERSOS através do For enhanced: "); 
        for(Object i : vetorDeDiversos3){
            System.out.print(i + ", ");
        }
        
        System.out.print("\nImprimindo array de BOOLEANS através do For enhanced: "); 
        for(boolean i : vetorDeBooleans3){
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
}
