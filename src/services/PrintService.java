package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	// lista genérica	
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	// testando se a lista está fazia
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		// retornar o primeiro membro da lista
		return list.get(0);
	}

	public void print() {
		// membros da lista
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
