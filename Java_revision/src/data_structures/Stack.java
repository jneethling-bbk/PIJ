package data_structures;

public class Stack {
	private IntegerListNode head;
	
	public Stack() {
		head = null;
	}
	
	public void push(int value) {
		IntegerListNode newNode = new IntegerListNode(value);
		IntegerListNode oldHead = head;
		head = newNode;		
		if (oldHead != null) {
			head.setNext(oldHead);
		}
	}
	
	public IntegerListNode pop() {
		if (head == null) {
			return null;
		} else {
			IntegerListNode oldHead = head;
			head = oldHead.getNext();
			return oldHead;
		}
	}
	
	public boolean empty() {
		if (head == null) {
			return true;
		} else return false;
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
