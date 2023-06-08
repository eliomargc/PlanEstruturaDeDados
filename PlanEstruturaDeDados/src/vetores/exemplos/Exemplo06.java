package vetores.exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vetores.model.Aluno;

/*
    * Aqui iremos trabalhar o problema de remover um elemento 
    * Iremos perceber que ao remover, temos que rearrumar a lista
    * Ao final, o aluno irá perceber que existe uma necessidade de ter uma classe já preparada com tais controles da lista
 */
public class Exemplo06 {

    static Aluno[] lista = new Aluno[4];

    public static void main(String[] args) {
        lista[0] = new Aluno("a");
        lista[1] = new Aluno("b");
        lista[2] = new Aluno("c");
        lista[3] = new Aluno("d");
        

        System.out.println("Array começando dessa forma: ");
        System.out.println(Arrays.toString(lista));

        //Removendo um elemento por posicao
//        int posicao = 3;
//        removerElementoComArrayCopy(posicao);
//        System.out.println("Array com elemento removido: ");
//        System.out.println(Arrays.toString(lista));
        //Removendo um elemento por nome
        removerElemento("d");
        System.out.println("Array com elemento removido por nome: ");
        System.out.println(Arrays.toString(lista));

    }

    private static void removerElemento(int posicao) {
        Aluno[] novaLista = new Aluno[lista.length - 1];
        for (int i = 0; i < posicao; i++) {
            novaLista[i] = lista[i];
        }
        for (int i = posicao+1; i < lista.length; i++) {
            novaLista[i - 1] = lista[i];
        }

        lista = novaLista;
    }

    private static void removerElementoComArrayCopy(int posicao) {
        Aluno[] novaLista = new Aluno[lista.length - 1];
        System.arraycopy(lista, 0, novaLista, 0, (lista.length - 1));
        System.arraycopy(lista, posicao + 1, novaLista, posicao, (lista.length - 1) - posicao);
        lista = novaLista;
    }

    private static void removerElemento(String n) {
        int posicaoRemover = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNome().equals(n)) {
                posicaoRemover = i;
                break;
            }
        }
        
        if (posicaoRemover != -1) {
            removerElementoComArrayCopy(posicaoRemover);
        }

        //Usando a classe arraylist
//        List<Aluno> list = new ArrayList<>(Arrays.asList(lista));
//        list.remove(new Aluno(n));
//        lista = list.toArray(new Aluno[0]);
    }

}
