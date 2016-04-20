package conditionals;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println(choose("What up"));
		System.out.println(choose("Who the man"));
		System.out.println(choose("Java is cool"));

	}
	static String choose(String b) {
		String answer;
		
		switch (b) {
			case "Who the man": 	answer = "Hannes";
									break;
			case "What up": 		answer = "All good";
									break;
			default:				answer = "Say what";
									break;
		}
		
		return answer;
	}

}
