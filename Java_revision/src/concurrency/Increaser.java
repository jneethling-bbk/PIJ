package concurrency;

public class Increaser implements Runnable {

	private Counter c;
	
	public Increaser(Counter c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser task = new Increaser(counter);
			new Thread(task).start();
		}
	}
}