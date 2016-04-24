package data_structures;

public class ListUtilities {

	public static void main(String[] args) {
		int[] array = {5,2,7,4,9,8};
		LinkList ll = toList(array);
		System.out.println(ll.toString());
	}
	public static LinkList toList(int[] array) {
		LinkList tl = new LinkList();
		for (int i : array) {
			tl.add(i);
		}
		return tl;
	}
}
