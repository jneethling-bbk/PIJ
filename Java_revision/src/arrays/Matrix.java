package arrays;

public class Matrix {
	int[][] matrix;
	
	public Matrix(int first, int second) {
		matrix = new int[first][second];
		for (int i=0; i < first; i++) {
			for (int j=0; j < second; j++) {
				matrix[i][j] = 1;
			}
		}
	}
	public void setElement(int first, int second, int value) {
		if (first > -1 && first < matrix.length && second > -1 && second < matrix[0].length) {
			matrix[first][second] = value;
		}
	}
	
	@Override
	public String toString() {
		String answer = "{{";
		for (int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				answer = answer + matrix[i][j];
				if (j < matrix[i].length - 1) {
					answer = answer + ",";
				}
				if (j == matrix[i].length - 1 && i < matrix.length - 1) {
					answer = answer + "},{";
				}
			}
		}
		return answer + "}}";
	}
	
	public void prettyPrint() {
		String div = new String(new char[matrix[0].length * 8]).replace("\0", "-");
		System.out.println(div);
		for (int i=0; i < matrix.length; i++) {
			String line = "|";
			for (int j=0; j < matrix[i].length; j++) {
				line = line + matrix[i][j] + "\t|";
			}
			System.out.println(line);
			System.out.println(div);
		}
	}
}
