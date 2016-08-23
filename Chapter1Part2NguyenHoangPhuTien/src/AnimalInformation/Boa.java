package AnimalInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about boa
 * this class extend by animal
 */
public class Boa extends Animal implements IRunning,IMoult,Iswimming,IBurrowing{

	public Boa() {
		super();
	}

	public Boa(String name, String food) {
		super(name, food);
	}

	@Override
	public String burrowing() {
		return "Can burrowing";
	}

	@Override
	public String swim() {
		return "Can swimming";
	}

	@Override
	public String molting() {
		return "Can molting";
	}

	@Override
	public String run() {
		return "Can running";
	}

	@Override
	public String toString() {
		return "Boa name : " + name + ", food : " + food + " " + this.burrowing()
				+ " " + this.molting() + " " + this.run() + " " + this.swim();
	}

	
}
