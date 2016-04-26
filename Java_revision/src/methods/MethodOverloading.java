package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(calc(2, 3));
		System.out.println(calc(2, 3, 4));
		System.out.println(calc(2.4, 2.5));
		System.out.println(calc("2", "3"));

	}
	static Number calc(int a, int b) {
		return a + b;
	}
	
	static Number calc(int a, int b, int c) {
		return a + b + c;
	}
	
	static Number calc(double a, double b) {
		return a + b;
	}
	
	static Number calc(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
}
