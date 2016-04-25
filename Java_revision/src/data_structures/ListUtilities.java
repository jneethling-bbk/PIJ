package data_structures;

public class ListUtilities {

	public static void main(String[] args) {
		int[] array = {9,5,7,4,2,1,8};
		LinkList ll = toLinkList(array);
		System.out.println(ll.toString());
		bubbleSort(ll);
		System.out.println(ll.toString());
		
		RecursiveList head = toRecursiveList(array);
		System.out.println(head.toString());
		head = bubbleSort(head);
		System.out.println(head.toString());
		
		
	}
	
	public static LinkList toLinkList(int[] array) {
		LinkList tl = new LinkList();
		for (int i : array) {
			tl.add(i);
		}
		return tl;
	}
	
	public static RecursiveList toRecursiveList(int[] array) {
		RecursiveList head = new RecursiveList(array[0]);
		for (int i = 1; i < array.length; i++) {
			head.add(new RecursiveList(array[i]));
		}
		return head;
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
	
	public static RecursiveList bubbleSort(RecursiveList unsorted) {
		boolean change = true;
		while (change) {
			change = false;
			RecursiveList first = unsorted;
			RecursiveList second = first.getNext();
			if (first.getValue() > second.getValue()) {
				unsorted = second;
				unsorted.setPrior(null);
				first.setNext(unsorted.getNext());
				first.setPrior(unsorted);
				second.setNext(first);
				change = true;
			}
			RecursiveList previous = unsorted;
			while (previous.getNext().getNext() != null) {
				RecursiveList current = previous.getNext();
				RecursiveList next = current.getNext();
				if (current.getValue() > next.getValue()) {
					previous.setNext(next);
					current.setNext(next.getNext());
					current.setPrior(next);
					next.setNext(current);
					next.setPrior(previous);
					change = true;
				}
			previous = previous.getNext();
			}
		}
		return unsorted;
	}
}
