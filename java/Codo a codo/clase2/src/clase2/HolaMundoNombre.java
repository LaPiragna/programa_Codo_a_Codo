package clase2;

import java.util.Scanner;

public class HolaMundoNombre {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// leo el valor de n
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			// muestro el valor de i
			System.out.println(i);
			// incremento el valor de i
			i++;
		}
	}
}
