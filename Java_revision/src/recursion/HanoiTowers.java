package recursion;

public class HanoiTowers {

	public static void main(String[] args) {
		System.out.println(hanoi(4));
		System.out.println(hanoi(3));
		System.out.println(hanoi(2));
		System.out.println(hanoi(1));

	}
	static int hanoi(int n) {
		if (n == 1) {
			return 1;
		} else {
			return hanoi(n - 1) * 2 + 1;
		}
	}

}
