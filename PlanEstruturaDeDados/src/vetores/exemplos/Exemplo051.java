package vetores.exemplos;

import java.util.Arrays;

/*
    * No exemplo04, nós declaramos, inicializamos, inserimos, e listamos/pegamos de forma normal e também com for 
    * Aqui iremos trabalhar o problema de adicionar um elemento em uma posição que já existe elemento, ou seja, no meio da lista
    * AGORA COM O MÉTODO ARRAYCOPY (conseguimos dispensar o uso do FOR)
 */
public class Exemplo051 {

    static String[] lista = new String[4];

    public static void main(String[] args) {
        lista[0] = "a";
        lista[1] = "b";
        lista[2] = "d";
        lista[3] = "e";

        System.out.println("Array começando dessa forma: ");
        System.out.println(Arrays.toString(lista));

        //Inserindo elemento no meio do Array já preenchido
        int posicaoInserir = 2;
        String valor = "c";
        inserirElemento(posicaoInserir, valor);

        System.out.println("\nCom elemento adicionado no meio ficou dessa forma: ");
        System.out.println(Arrays.toString(lista));

        inserirElemento("f");
        System.out.println("\nCom elemento adicionado normal ao final, ficou dessa forma: ");
        System.out.println(Arrays.toString(lista));
    }

    static void inserirElemento(int posicaoInserir, String valor) {
        String[] novaLista = new String[lista.length + 1];

        //copia os da esquerda
        System.arraycopy(lista, 0, novaLista, 0, posicaoInserir);
        //copia movendo os da direita
        System.arraycopy(lista, posicaoInserir, novaLista, posicaoInserir + 1, lista.length - posicaoInserir);

        //insere o novo valor no espaço aberto
        novaLista[posicaoInserir] = valor;
        lista = novaLista;
    }

    private static void inserirElemento(String valor) {
        String[] novaLista = new String[lista.length + 1];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        novaLista[lista.length] = valor;
        lista = novaLista;
    }

}
