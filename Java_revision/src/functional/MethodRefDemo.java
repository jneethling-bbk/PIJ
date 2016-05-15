package functional;

import java.util.function.UnaryOperator;

public class MethodRefDemo {

	private static String reverse(UnaryOperator<String> uo, String s) {
		return uo.apply(s);
	}
	
	public static void main(String[] args) {
		String inString = "bulawayo";
		String outString;
		StringReverser sr = new StringReverser();
		
		outString = reverse(sr :: reverseString, inString);		
		System.out.println(outString);
	}
}
