package recursion;

public class DoggyMethodTester {

	public static void main(String[] args) {
		System.out.println(doggyMethod(6));

	}
	public static String doggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		return result;
	}

}
