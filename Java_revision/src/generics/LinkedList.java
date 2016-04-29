package generics;

public class LinkedList<T> {

	private T nodeValue;
	private LinkedList<T> next;
	private LinkedList<T> prior;
	
	public LinkedList(T value) {
		nodeValue = value;
		next = null;
		prior = null;
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
			next.prior = this;
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
	
	public void setPrior(LinkedList<T> prior) {
		this.prior = prior;
	}
	
	public LinkedList<T> getPrior() {
		return prior;
	}
}
