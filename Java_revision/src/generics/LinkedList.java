package generics;

public class LinkedList<T> {

	protected T nodeValue;
	protected LinkedList<T> next;
	
	public LinkedList(T value) {
		nodeValue = value;
		next = null;
	}
	
	public void add(LinkedList<T> toAdd) {
		if (next == null) {
			next = toAdd;
		} else {
			next.add(toAdd);
		}
	}
	
	public boolean delete(LinkedList<T> toDelete) {
		if (next == null) {
			return false;
		} else if (next.nodeValue == toDelete.nodeValue) {
			next = next.next;
			return true;
		} else {
			return next.delete(toDelete);
		}
	}
	
	@Override
	public String toString() {
		String str = "[" + nodeValue;
		LinkedList<T> current = next;
		while (current.next != null) {
			str = str + ", " + current.nodeValue;
			current = current.next;
		}
		return str + ", " + current.nodeValue + "]";
	}
	
	public T getValue() {
		return nodeValue;
	}
	
	public void setNext(LinkedList<T> next) {
		this.next = next;
	}
	
	public LinkedList<T> getNext() {
		return next;
	}
}
