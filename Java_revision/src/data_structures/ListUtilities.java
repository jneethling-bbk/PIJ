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
			IntegerListNode first = unsorted.getHead();
			IntegerListNode second = first.getNext();
			if (first.getValue() > second.getValue()) {
				unsorted.removeHead();
				first.setNext(second.getNext());
				second.setNext(first);
				change = true;
			}
			IntegerListNode previous = unsorted.getHead();
			while (previous.getNext().getNext() != null) {
				IntegerListNode current = previous.getNext();
				IntegerListNode next = current.getNext();
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
