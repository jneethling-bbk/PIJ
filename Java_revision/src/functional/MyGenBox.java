package functional;

public class MyGenBox<T> {

	private T value;
	
	public MyGenBox(T value) {
		this.value = value;
	}
	
	public MyGenBox() {
		value = null;
	}
	
	public T getVal() {
		return value;
	}
}
