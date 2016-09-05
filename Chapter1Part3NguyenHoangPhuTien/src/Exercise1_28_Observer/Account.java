package Exercise1_28_Observer;

import java.util.ArrayList;
import java.util.List;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Account
 */
public class Account {

	private List<Observer> list = new ArrayList<>();
	private double state;
	
	public Account() {
		super();
	}
	
	public double getState() {
		return state;
	}
	
	public void setState(double state) {
		this.state = state;
		notifyAllObserver();
	}
	
	/*
	 * Add observer into list of Observers
	 */
	public void attach(Observer observer){
		
		list.add(observer);
	}
	
	/*
	 * Notify to all observer when account change
	 */
	public void notifyAllObserver(){
		
		for(Observer observer : list){
			observer.update();
		}
			
	}
}
