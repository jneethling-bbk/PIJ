package conditionals;

public class Ternary {

	public static void main(String[] args) {
		System.out.println("You are" + test(15) + "an adult.");
		System.out.println("You are" + test(30) + "an adult.");

	}
	static String test(int age) {
		String str = (age > 18) ? " " : " not ";		
		return str;
	}

}
