package data_structures;

public class ListUtilities {

	public static void main(String[] args) {
		int[] array = {5,9,7,4,2,1,8};
		LinkList ll = toList(array);
		System.out.println(ll.toString());
		bubbleSort(ll);
		System.out.println(ll.toString());
	}
	
	public static LinkList toList(int[] array) {
		LinkList tl = new LinkList();
		for (int i : array) {
			tl.add(i);
		}
		return tl;
	}
	
	public static void bubbleSort(LinkList unsorted) {
		boolean change = true;
		while (change) {
			change = false;
			IntegerNode first = unsorted.getHead();
			IntegerNode second = first.getNext();
			if (first.getValue() > second.getValue()) {
				unsorted.removeHead();
				first.setNext(second.getNext());
				second.setNext(first);
				change = true;
			}
			IntegerNode previous = unsorted.getHead();
			while (previous.getNext().getNext() != null) {
				IntegerNode current = previous.getNext();
				IntegerNode next = current.getNext();
				if (current.getValue() > next.getValue()) {
					previous.setNext(next);
					current.setNext(next.getNext());
					next.setNext(current);
					change = true;
				}
			previous = previous.getNext();
			}
		}
	}
}
