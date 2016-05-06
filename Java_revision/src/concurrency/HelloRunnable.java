package concurrency;

public class HelloRunnable implements Runnable {

	private final int id;
	
	public HelloRunnable(int id) {
		this.id = id;
	}
	
    @Override
	public void run() {
        try {
			greet();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    public void greet() throws InterruptedException {
    	System.out.println("Hello from thread " + id);
    	//Thread.sleep(1000);
    	System.out.println("Hello again from thread " + id);
    	//Thread.sleep(1000);
    	System.out.println("Thread " + id + " still here!");
    	//Thread.sleep(1000);
    	System.out.println("Thread " + id + " about to end!");
    	//Thread.sleep(1000);
    	System.out.println("Thread " + id + " signing off!");
    	//Thread.sleep(1000);
    	System.out.println("Thread " + id + " ended!");
    	
    }
    
    public static void main(String args[])  {
        for (int i = 1; i < 10; i++) {
        	(new Thread(new HelloRunnable(i))).start();
        }
    }
}
