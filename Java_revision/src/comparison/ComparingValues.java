package comparison;

public class ComparingValues {

	public static void main(String[] args) {
		System.out.println("Should be false: " + testInt(32));
		System.out.println("Should be true: " + testInt(42));
		Double d = 2.0/3.0;
		Double c = 4000.0/6000.0;
		if (d != c) {
			System.out.println("The wrong way of comparing doubles");
		}
		System.out.println("Should be true: " + testDouble(d));
		System.out.println("Should be false: " + testString("forty-one"));
		System.out.println("Should be true: " + testString("forty-two"));

	}
	static boolean testInt(int n) {
		if (n == 42) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean testDouble(Double d) {
		Double c = 4000.0/6000.0;
		if (Math.abs(d - c) < 10E-6) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean testString(String str) {
		if (str.equals("forty-two")) {
			return true;
		} else {
			return false;
		}
	}
}
