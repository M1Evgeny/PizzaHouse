package by.pvt.Pizza.inputReader;

import java.util.Scanner;

public class InputReader {
	public int pizzaName() {
		System.out.println("If you want a Mexican pizza, please, type 1");
		System.out.println("If you want a Pepperoni pizza, please, type 2");
		Scanner sc = new Scanner(System.in);
		int name = sc.nextInt();
		return name;
	}

	public int pizzaSize() {
		System.out.println("If you want a small pizza, please, type 1");
		System.out.println("If you want a medium pizza, please, type 2");
		System.out.println("If you want a lagre pizza, please, type 3");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		return size;
	}
}
