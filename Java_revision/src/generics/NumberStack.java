package generics;

public class NumberStack <N extends Number> {
	
	private NumberNode head;
	
	public void push(N value) {
		NumberNode newNode = new NumberNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public Number pop() {
		NumberNode returnNode = head;
		if (returnNode != null) {
			if (returnNode.next != null) {
				head = returnNode.next;
			} else {
				head = null;
			}
			return returnNode.getValue();
		} else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	class NumberNode {
		
		N value;
		NumberNode next;
		
		NumberNode(N value) {
			this.value = value;
			next = null;
		}
		
		N getValue() {
			return value;
		}
		
	}
	
}
