package data_structures;

public class TreeDriver {

	public static void main(String[] args) {
		IntegerTree root = new IntegerTree(51);
		int[] array = {83, 26, 66, 97, 11, 43, 9, 67, 33, 90, 23};
		for (int i : array) {
			root.add(i);
		}
		//System.out.println(root.toString());
		

		
	}

}
