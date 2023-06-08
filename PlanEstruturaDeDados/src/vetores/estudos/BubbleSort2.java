package vetores.estudos;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 7, 1, 6 };
        int n = arr.length;
        int temp = 0;
        int contador=0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                contador++;
            }
        }
        
        System.out.println("Desempenho: " + contador);

	}

}
