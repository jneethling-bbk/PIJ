package arrays;

public class ArrayCopier {

	public static void main(String[] args) {
		int[] src = {1, 2, 3, 4, 5};
		int[] dst1 = new int[5];
		int[] dst2 = new int[3];
		int[] dst3 = new int[7];
		arrayCopy(src, dst1);
		arrayPrint(dst1);
		arrayCopy(src, dst2);
		arrayPrint(dst2);
		arrayCopy(src, dst3);
		arrayPrint(dst3);
	}
	static void arrayCopy(int[] src, int[] dst) {
		if (src.length > dst.length) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		} else {
			for (int i = 0; i < src.length; i++) {
				dst[i] = src[i];
			}
			if (src.length < dst.length) {
				for (int i = src.length; i < dst.length; i++) {
					dst[i] = 0;
				}
			}
		}
	}
	static void arrayPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}

}
