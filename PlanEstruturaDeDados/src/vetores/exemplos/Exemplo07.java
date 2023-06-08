package vetores.exemplos;

import vetores.utils.MyArrayListStrings;

public class Exemplo07 {
    public static void main(String[] args) {
        String a1 = "Maria";
        String a2 = "José";
        String a3 = "João";
        
        MyArrayListStrings lista = new MyArrayListStrings();
        lista.adicionar(a1);;
        lista.adicionar(a2);
        lista.adicionar(a3);
        
        System.out.println("Elementos: " + lista);
        System.out.println("Tamanho da lista: " + lista.tamanho());
        System.out.println("Maria existe na lista? " +  lista.contem("maria") ) ;
        System.out.println("Pegando um valor: " + lista.pegar(0)); 
        lista.adicionar(2, "Eliomar");
        System.out.println("Novo elemento adicionado: " + lista);
        lista.remover(1);
        System.out.println("Elemento removido: " + lista);
        
    }
}
