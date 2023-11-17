package clase1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Hello World!");
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		arreglo.add(1);
		arreglo.add(2);
		arreglo.add(3);
		System.out.println(arreglo.toString());
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		arreglo.add(number);
		System.out.println("New array:");
		System.out.println(arreglo.toString());
	}
}
