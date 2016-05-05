package generics;

import java.util.Arrays;
import java.util.List;

public class WildcardMethods {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		printList(li);
		System.out.println("sum = " + sumOfList(li));
		
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		printList(ld);
		System.out.println("sum = " + sumOfList(ld));
		
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(ls);
		
		Integer[] ints = {4, 1, 7, 3, 9, 6};
		System.out.println(toString(ints));
		swap(ints, 1, 3);
		System.out.println(toString(ints));
		
		String[] strings = {"Brittania", "rules", "the", "waves"};
		System.out.println(toString(strings));
		swap(strings, 1, 3);
		System.out.println(toString(strings));
		
	}
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
	
	public static void printList(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	public static <T> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static <T> String toString(T[] array) {
		String str = "[";
		for (T t : array) {
			str = str + t.toString() + " ";
		}
		
		return str + "]";
	}

}
