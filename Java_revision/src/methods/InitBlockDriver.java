package methods;

public class InitBlockDriver {

	public static void main(String[] args) {
		InitBlock block1 = new InitBlock("This is");
		System.out.println(block1.getConcat());

		InitBlock block2 = new InitBlock("This is", "another");
		System.out.println(block2.getConcat());
	}

}
