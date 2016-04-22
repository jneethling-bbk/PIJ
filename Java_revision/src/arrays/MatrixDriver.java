package arrays;

public class MatrixDriver {

	public static void main(String[] args) {
		Matrix m = new Matrix(5, 6);
		
		m.setElement(1, 1, 35);
		System.out.println(m.toString());
		m.prettyPrint();

	}

}
