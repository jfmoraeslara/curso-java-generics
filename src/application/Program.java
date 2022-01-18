package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// instanciando um tipo de lista generics (String)
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("Quanto nomes na lista? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("Primeiro nome: " + x);
		
		sc.close();
	}
}
