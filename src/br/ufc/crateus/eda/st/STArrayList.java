package br.ufc.crateus.eda.st;

import java.util.Arrays;

public class STArrayList<T> {
	private T[] array;
	private int length = 0;
	
	@SuppressWarnings("unchecked")
	public STArrayList(int len) {
		this.array = (T[]) new Object[len];
	}
	
	public STArrayList() {
		this(10);
	}
	
	public void add (T val) {
		if (length == array.length) resize();
		array[length++] = val;
	}
	
	public void add (int i, T val) {
		// !TODO: implementar
	}
	
	public T get (int i) {
		return (i < length)? array[i] : null;
	}
	
	private void resize(){
		array = Arrays.copyOf(array, 2 * array.length);
	}

}
