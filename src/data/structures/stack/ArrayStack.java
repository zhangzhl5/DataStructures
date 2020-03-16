package data.structures.stack;

import data.structures.array.Array;

public class ArrayStack<E> implements Stack<E> {
	
	Array<E>  array;
	
	public ArrayStack() {
		
		array = new Array<>();
	}
	
	public ArrayStack(int capacity) {
		
		array = new Array<>(capacity);
	}

	@Override
	public int getsize() {
		
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		
		return array.isEmpty();
	}

	@Override
	public void push(E e) {
		
		array.addLast(e);
		
	}

	@Override
	public E pop() {
		
		return array.removeLast();
	}

	@Override
	public E peek() {
		
		return array.getLast();
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack: ");
		res.append('[');
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.get(i));
			if(i != array.getSize() -1) {
				res.append(", ");
			}
		}
		res.append("] top ");
		return res.toString();
	}

}
