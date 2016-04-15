package basics;

public class McCarthy91Tester {

	public static void main(String[] args) {
		System.out.println(mcCarthy91(0));

	}
	static int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n + 11));
		}	
	}

}
