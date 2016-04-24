package data_structures;

public class Queue {
	private IntegerNode head;
	
	public Queue() {
		head = null;
	}
	
	public void insert(int value) {
		IntegerNode newNode = new IntegerNode(value);
		if (head == null) {
			head = newNode;
			return;
		} else {
			IntegerNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	public IntegerNode retrieve() {
		if (head == null) {
			return null;
		} else {
			IntegerNode current = head;
			head = current.getNext();
			return current;
		}
	}
	
	public int size() {
		int size = 0;
		if (head == null) {
			return 0;
		} else {
			IntegerNode current = head;
			while (current != null) {
				size++;
				current = current.getNext();
			}
		}
		return size;
	}
	
	@Override
	public String toString() {
		String str = "[";
		if (head != null) {
			IntegerNode current = head;
			str = str + current.getValue();
			while (current.getNext() != null) {
				current = current.getNext();
				str = str + ", " + current.getValue();
			}
		}
		return str + "]";
	}
}
