package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// instanciando um tipo de lista generics (Integer)
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quanto valores na lista? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("Primeiro valor: " + x);
		
		sc.close();
	}
}
