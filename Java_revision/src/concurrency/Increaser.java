package concurrency;

public class Increaser implements Runnable {

	//Counter is a shared resource so numbers cannot be repeated
	private Counter c;
	
	public Increaser(Counter c) {
		this.c = c;
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		//There are 2 threads
		for (int i = 0; i < 2; i++) {
			Increaser task = new Increaser(counter);
			new Thread(task).start();
		}
	}
	
	@Override
	public void run() {
		//Each thread will print 500 numbers
		for (int i = 0; i < 500; i++) {
			c.increase();
			System.out.println(c.getCount());
		}
	}
}