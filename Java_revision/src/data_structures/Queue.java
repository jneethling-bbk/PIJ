package data_structures;

public class Queue {
	private IntegerListNode head;
	
	public Queue() {
		head = null;
	}
	
	public void insert(int value) {
		IntegerListNode newNode = new IntegerListNode(value);
		if (head == null) {
			head = newNode;
			return;
		} else {
			IntegerListNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}
	
	public IntegerListNode retrieve() {
		if (head == null) {
			return null;
		} else {
			IntegerListNode oldHead = head;
			head = oldHead.getNext();
			return oldHead;
		}
	}
	
	public int size() {
		int size = 0;
		if (head == null) {
			return 0;
		} else {
			IntegerListNode current = head;
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
			IntegerListNode current = head;
			str = str + current.getValue();
			while (current.getNext() != null) {
				current = current.getNext();
				str = str + ", " + current.getValue();
			}
		}
		return str + "]";
	}
}
