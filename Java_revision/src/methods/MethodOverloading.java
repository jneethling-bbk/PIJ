package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(calc(2, 3));
		System.out.println(calc(2, 3, 4));
		System.out.println(calc("2", "3"));

	}
	static int calc(int a, int b) {
		return   a + b;
	}
	
	static int calc(int a, int b, int c) {
		return a + b + c;
	}
	
	static int calc(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}

}
