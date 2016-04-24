package data_structures;

public class Stack {
	private IntegerNode head;
	
	public Stack() {
		head = null;
	}
	
	public void push(int value) {
		IntegerNode newNode = new IntegerNode(value);
		IntegerNode oldHead = head;
		head = newNode;		
		if (oldHead != null) {
			head.setNext(oldHead);
		}
	}
	
	public IntegerNode pop() {
		if (head == null) {
			return null;
		} else {
			IntegerNode oldHead = head;
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
