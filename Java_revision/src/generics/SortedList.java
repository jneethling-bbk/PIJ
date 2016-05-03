package generics;

public class SortedList<T extends Comparable<T>> extends LinkedList<T> {

	public SortedList(T value) {
		super(value);
	}
	
	@Override
	public void add(LinkedList<T> toAdd) {
		if (next == null) {
			next = toAdd;
		} else if (toAdd.nodeValue.compareTo(next.nodeValue) < 0) {
			toAdd.setNext(next);
			this.setNext(toAdd);
		} else {
			next.add(toAdd);
		}
	}
}
