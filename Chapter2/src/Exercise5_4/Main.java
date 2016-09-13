package Exercise5_4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		for(int i = 1; i <= 10; i++){
			ThreadDemo t = new ThreadDemo("Googel" + i);
			t.start();
			
		}
		
	}

}
