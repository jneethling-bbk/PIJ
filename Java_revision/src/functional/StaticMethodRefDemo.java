package functional;

import java.util.function.UnaryOperator;

public class StaticMethodRefDemo {

	private static String reverse(UnaryOperator<String> uo, String s) {
		return uo.apply(s);
	}
	
	public static void main(String[] args) {
		String inString = "bulawayo";
		String outString;
		
		outString = reverse(StaticStringReverser :: reverseString, inString);
		
		System.out.println(outString);

	}

}
