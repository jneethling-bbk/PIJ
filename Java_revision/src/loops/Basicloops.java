package loops;

public class Basicloops {

	public static void main(String[] args) {
		System.out.println(isPrime(29));
		System.out.println(multiplyWithConstraint(5, 9));
		System.out.println(divideWithConstraint(47, 9));

	}
	static boolean isPrime(int input) {
		boolean test = true;
		for (int y = 2; y < input; y++) {
			if (input % y == 0) {
				test = false;
			}
		}
		return test;
	}
	
	static int multiplyWithConstraint(int input1, int input2) {
		int answer = 0;
		int counter = 0;
		while (counter < input1) {
			answer = answer + input2;
			counter++;
		}
		return answer;
	}
	
	static String divideWithConstraint(int input1, int input2) {
		int answer = 0;
		int remainder = input1;
		while (remainder >= input2) {
			remainder = remainder - input2;
			answer++;
		}
		return answer + " remainder " + remainder;
	}

}
