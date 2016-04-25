package data_structures;

public class RecursiveList {

	private int nodeValue;
	private RecursiveList next;
	private RecursiveList prior;
	
	public RecursiveList(int value) {
		nodeValue = value;
		next = null;
		prior = null;
	}
	
	public void add(RecursiveList toAdd) {
		if (next == null) {
			next = toAdd;
		} else {
			next.add(toAdd);
		}
	}
	
	public boolean delete(RecursiveList toDelete) {
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
		RecursiveList current = next;
		while (current.next != null) {
			str = str + ", " + current.nodeValue;
			current = current.next;
		}
		return str + ", " + current.nodeValue + "]";
	}
	
	public int getValue() {
		return nodeValue;
	}
	
	public void setNext(RecursiveList next) {
		this.next = next;
	}
	
	public RecursiveList getNext() {
		return next;
	}
	
	public void setPrior(RecursiveList prior) {
		this.prior = prior;
	}
	
	public RecursiveList getPrior() {
		return prior;
	}
}
