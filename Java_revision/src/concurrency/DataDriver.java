package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataDriver implements Runnable {

	private DataStructure d;
	private int id;
	
	public DataDriver(DataStructure d, int id) {
		this.d = d;
		this.id = id;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int ran = (int)Math.abs((1000 * Math.random())+1);
			d.add(ran);
			System.out.println("Thread " + id + " adding a " + ran);
			if (d.getCount() == 1000) {
				System.out.println("Thread " + id + " reporting data strucure full!");
			}
		}
	}
	
	public static void main(String[] args) {
		DataStructure struct = new DataStructure();
		ExecutorService e = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 100; i++) {
			DataDriver task = new DataDriver(struct, i);
			//new Thread(task).start();
			e.submit(task);
		}
		e.shutdown();
		
	}
}
