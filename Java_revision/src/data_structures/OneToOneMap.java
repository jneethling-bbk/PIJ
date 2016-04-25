package data_structures;

public class OneToOneMap {

	private String[] data;
	
	public OneToOneMap() {
		data = new String[1000];
	}
	
	public void put(int key, String value) {
		if (data[key] != null) {
			System.out.println("Key in use");
		} else {
			data[key] = value;
		}
	}
	
	public String get(int key) {
		return data[key];
	}
	
	public void remove(int key) {
		data[key] = null;
	}
	
	public boolean isEmpty() {
		boolean answer = true;
		for (String s : data) {
			if (s!= null) {
				answer = false;
			}
		}
		return answer;
	}
}
