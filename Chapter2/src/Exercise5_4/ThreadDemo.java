package Exercise5_4;

/**
 * @author Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date: 13/9/2016
 * Class for demo of thread
 */
public class ThreadDemo extends Thread{
	 static int num = 0;
	String nameThread;

	public ThreadDemo(String nameThread) {
		super();
		this.nameThread = nameThread;
	}

	public String getNameThread() {
		return nameThread;
	}
	
	public void setNameThread(String nameThread) {
		this.nameThread = nameThread;
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	//Auto increment state num
	synchronized void increment() throws InterruptedException{
		for(int i = 1; i <= 10; i++){
			num++;
			System.out.println("Thread: " + Thread.currentThread().getName() + " " + num);
			
		}
		Thread.sleep(1000);
	}

	//Override method run of Thread
	@Override
	public void run() {
		
		try {
			increment();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
