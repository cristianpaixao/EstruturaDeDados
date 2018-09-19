package br.com.processamentodedados;

public class Main {

	public static void main(String[] args) {
		ListaEstatica lista = new ListaEstatica(4);
		
		System.out.println(lista.add(1));
		System.out.println(lista.add(2));
		System.out.println(lista.add(3));
		System.out.println(lista.add(4));
		lista.show();
		System.out.println(lista.removeByIndex(0));
		lista.show();
		System.out.println(lista.removeElement(4));
		lista.show();
	}

}
