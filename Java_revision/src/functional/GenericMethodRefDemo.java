package functional;

public class GenericMethodRefDemo {

	public static <T> int count(MyFunction mf, T[] vals, T v) {
		return mf.doIt(vals, v);
	}
	
	public static void main(String[] args) {
		Integer[] values = {1, 2, 3, 4, 4, 3, 2, 7, 3};
		String[] strings = {"One", "Two", "Three", "Two"};
		int counter;
		
		counter = count(MyArrayOps :: countMatching, values, 3);
		System.out.println("values contain " + counter + " 3s");
		
		counter = count(MyArrayOps :: countMatching, strings, "Two");
		System.out.println("strings contain " + counter + " Twos");
	}

}
