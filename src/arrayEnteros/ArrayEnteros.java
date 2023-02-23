package arrayEnteros;
import java.util.Scanner;

public class ArrayEnteros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arrayEntero;
		arrayEntero = new int[10];
		int aux = 0;
		
		System.out.println("Ingrese 10 numeros enteros");
		for (int i = 0; i < arrayEntero.length; i++) {
			arrayEntero[i] = scanner.nextInt();
			if (arrayEntero[i] > aux) {
				aux = arrayEntero[i];
			}
		}
		System.out.println("El numero mas grande el array es: " + aux);
	}
}