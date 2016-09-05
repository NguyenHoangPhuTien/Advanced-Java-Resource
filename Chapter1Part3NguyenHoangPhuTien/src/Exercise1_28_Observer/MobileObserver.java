package Exercise1_28_Observer;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Mobile Observer
 * Extend from Observer
 */
public class MobileObserver extends Observer{

	public MobileObserver(Account account) {
		
		this.account = account;
		this.account.attach(this);
	}

	/*
	 * Notify to mobile  when account change
	 */
	@Override
	public void update() {
		
		System.out.println("Mobile: Your money minus " + account.getState()); 
	}

	
}
