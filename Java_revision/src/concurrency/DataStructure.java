package concurrency;

public class DataStructure {

	private int[] data = new int[1000];
	private int counter;
	
	public DataStructure() {
		for (int i : data) {
			data[i] = 0;
		}
		counter = 0;
	}
	
	public synchronized void add(int n) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 0) {
				data[i] = n;
				if (counter != i) {
					System.out.println("The system is out of sync!");
				}
				counter++;
				break;
			}
		}
	}
	
	public int getCount() {
		return counter;
	}
}
