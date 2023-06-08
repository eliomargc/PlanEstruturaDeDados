package vetores.exemplos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorDigitado = 0;
        int maior = 0;
        for(int i = 0; i < 5; i++){
            System.out.print(i+1 + " - Digite um valor: ");
            valorDigitado = input.nextInt();
            if(valorDigitado > maior){
                maior = valorDigitado;
            }
        }
        
        System.out.println("Maior: " + maior);
    }
}
