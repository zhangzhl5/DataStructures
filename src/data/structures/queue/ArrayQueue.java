package data.structures.queue;

import data.structures.array.Array;

public class ArrayQueue<E> implements Queue<E> {
	
	Array<E>  array;
	
	public ArrayQueue() {
		
	}
	
	public ArrayQueue(int capacity) {
		
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
	public void enqueue(E e) {
		
		array.addLast(e);
		
	}

	@Override
	public E dequeue() {
		
		return array.removeFirst();
	}

	@Override
	public E getFront() {	
		
		return array.getFirst();
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Queue: ");
		res.append("Front [");
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.get(i));
			if(i != array.getSize() -1) {
				res.append(", ");
			}
		}
		res.append("] tail ");
		return res.toString();
	}

}
