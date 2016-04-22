package casting;

public class CastingToDouble {

	public static void main(String[] args) {
		System.out.println(divide(9, 4));

	}
	static double divide(int input1, int input2) {
		double numerator = (double) input1;
		double denominator = (double) input2;
		return numerator/denominator;
	}

}
