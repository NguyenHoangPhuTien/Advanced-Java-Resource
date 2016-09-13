package Exercise5_1;

/**
 * @author Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date: 13/9/2016
 * Class for thread demo
 */
public class ThreadDemo extends Thread{

	private Thread t;
	private String threadName;
	
	public ThreadDemo(String threadName) {
		
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}

	//Override method run of Thread
	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for(int i = 3; i > 0; i--){
				System.out.println("Thread name " + threadName + ", " + i);
				
				//Let the thread sleep for a while
				Thread.sleep(50);
			}
		} catch (InterruptedException e){
			System.out.println("Thread " + threadName + "interrupted.");
		}
	}

	//Override method start of Thread
	@Override
	public synchronized void start() {
		
		System.out.println("Starting " + threadName);
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	
	
}
