package parsing;

public class IntParsing {

	public static void main(String[] args) {
		String firstString = "3";
		String secondString = "2";
		System.out.println(Integer.parseInt(firstString) + Integer.parseInt(secondString));
		String thirdString = "3,4,7,2";
		System.out.println(parseAndSum(thirdString));
	}
	public static int parseAndSum(String str) {
		String[] strVals = str.split(",");
		int answer = 0;
		for (String s : strVals) {
			answer = answer + Integer.parseInt(s);
		}
		return answer;
	}

}
