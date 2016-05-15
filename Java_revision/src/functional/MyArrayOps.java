package functional;

public class MyArrayOps {

	public static <T> int countMatching(T[] vals, T t) {
		int counter = 0;
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] == t) {
				counter++;
			}
		}
		return counter;
	}
}
