package AnimalInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about tiger
 * this class extend by animal
 */

public class Tiger extends Animal implements IBurrowing,IRunning{

	public Tiger() {
		super();
	}

	public Tiger(String name, String food) {
		super(name, food);
	}

	@Override
	public String run() {
		return "Can run";
	}

	@Override
	public String burrowing() {
		return "Can burrowing";
	}

	@Override
	public String toString() {
		return "Tiger name : " + name + ", food : " + food + " " + this.run() + " " + this.burrowing();
	}

	
	
}
