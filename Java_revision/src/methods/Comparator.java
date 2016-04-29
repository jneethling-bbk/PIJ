package methods;

public class Comparator {

	public static void main(String[] args) {
		System.out.println(getMax(5, 9));
		System.out.println(getMax(3, 7));
		System.out.println(getMax("4", "2"));

	}
	public static double getMax(double d1, double d2) {
		return (double) getMax((int) d1, (int) d2);
	}
	
	public static String getMax(String s1, String s2) {
		return "" + getMax(Integer.parseInt(s1), Integer.parseInt(s2));
	}
	
	public static int getMax(int i1, int i2) {
		if (i1 > i2) {
			return i1;
		} else {
			return i2;
		}
	}

}
