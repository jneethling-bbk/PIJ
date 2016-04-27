package data_structures;

public class SortedList {
	private IntegerListNode head;
	
	public SortedList() {
		head = null;
	}
	
	public void add(int value) {
		IntegerListNode newNode = new IntegerListNode(value);
		if (head == null) {
			head = newNode;
			return;
		} else {
			IntegerListNode current = head;
			if (value < head.getValue()) {
				head = newNode;
				head.setNext(current);
				return;
			}
			while (current.getNext() != null && current.getNext().getValue() < value) {
				current = current.getNext();
			}
			if (current.getNext() == null) {
				current.setNext(newNode);
			} else {
				newNode.setNext(current.getNext());
				current.setNext(newNode);
			}			
		}
	}
	
	public boolean delete(int value) {
		if (head == null) {
			return false;
		}
		if (head.getValue() == value) {
			head = head.getNext();
			return true;
		}
		IntegerListNode current = head;
		while (current.getNext() != null && current.getNext().getValue() != value) {
			current = current.getNext();
		}
		if (current.getNext() == null) {
			return false;
		} else {
			current.setNext(current.getNext().getNext());
			return true;
		}
	}
	public boolean contains(int n) {
		IntegerListNode current = head;
		while (current.getNext() != null) {
			if (current.getValue() == n) {
				return true;
			} else {
				current = current.getNext();
			}
		}
		return false;
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
