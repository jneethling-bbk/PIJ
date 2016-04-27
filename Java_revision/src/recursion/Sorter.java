package recursion;

public class Sorter {

	public static void main(String[] args) {
		int[] array = new int[50];
		for (int i = 0; i < 50; i++) {
			array[i] = (int) Math.abs(1000 * Math.random());
		}
		
		printArray(array);
		MergeSort ms = new MergeSort();
		ms.sort(array);
		printArray(array);
		

	}
	public static void printArray(int[] array) {
		String str = "[" + array[0];
		for (int i = 1; i < array.length; i++) {
			str = str + ", " + array[i];
		}
		System.out.println(str + "]");
	}

}
