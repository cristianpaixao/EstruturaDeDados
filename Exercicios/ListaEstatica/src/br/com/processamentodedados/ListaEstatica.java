package br.com.processamentodedados;

public class ListaEstatica {
	private int[] array;
	private int nbElem;
	
	/**
	 * Constructor Method
	 */
	public ListaEstatica(int size) {
		this.array = new int[size];
		this.nbElem = 0;
	}
	
	public int add(int element ) {
		if (this.nbElem == this.array.length) {
			return -1;
		}
		this.array[this.nbElem] = element;
		this.nbElem++;
		return 0;
	}
	
	public void show( ) {
		for (int i = 0; i < this.nbElem; i++) {
			System.out.println("Index[" + i + "] = " + this.array[i]);
		}
	}
	
	public int search(int value) {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public int removeByIndex(int index) {
		if (index > this.array.length) {
			return -1;
		}
		while (index < (this.array.length -1)) {
			this.array[index] = this.array[index + 1];
			index++;
		}
		this.nbElem--;
		return 0;
	}
	
	public int removeElement(int element) {
		for (int i = 0; i < nbElem; i++) {
			if (element == this.array[i]) {
				this.removeByIndex(i);
				return 0;
			}
		}
		
		return -1;
	}

	
}
