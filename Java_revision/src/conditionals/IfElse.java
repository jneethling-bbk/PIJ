package conditionals;

public class IfElse {

	public static void main(String[] args) {
		System.out.println(printInOrder(5, 9, 2));

	}
	static String printInOrder(int input1, int input2, int input3) {
		int lowest = 0;
		int highest = 0;
		int middle = 0;
		
		if (input1 < input2 && input1 < input3) {
			lowest = input1;
		} else if (input1 > input2 && input1 > input3) {
			highest = input1;
		} else {
			middle = input1;
		}
		
		if (input2 < input1 && input2 < input3) {
			lowest = input2;
		} else if (input2 > input1 && input2 > input3) {
			highest = input2;
		} else {
			middle = input2;
		}
		
		if (input3 < input1 && input3 < input2) {
			lowest = input3;
		} else if (input3 > input1 && input3 > input2) {
			highest = input3;
		} else {
			middle = input3;
		}
		
		return lowest + " " + middle + " " + highest;
	}

}
