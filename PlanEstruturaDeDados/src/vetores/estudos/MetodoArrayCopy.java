package vetores.estudos;

import java.util.Arrays;

//Estudo sobbre o método arraycopy
public class MetodoArrayCopy {
    public static void main(String[] args) {
        int[] list = new int[10];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
        list[5] = 6;
        list[6] = 7;
        list[7] = 8;
        list[8] = 9;
        list[9] = 10;
        int[] list2 = new int[list.length];
        //src = lista de origem,  
        //srcPos = onde vai começar a copiar da lista,
        //dest = lista de destino
        //destPos = onde vai começar a colar na lista destino  
        //lenght= quant de elementos para copiar da lista de origem
        System.arraycopy(list, 10,list2, 0, 0);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list2));
        
    }
}
