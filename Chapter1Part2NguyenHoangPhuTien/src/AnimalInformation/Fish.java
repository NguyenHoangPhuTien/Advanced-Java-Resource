package AnimalInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about fish
 * this class extend by animal
 */

public class Fish extends Animal implements Iswimming,IBurrowing{

	public Fish() {
		super();	
	}

	public Fish(String name, String food) {
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
	public String toString() {
		return "Fish name : " + name + ", food : " + food + " " + this.burrowing() + " " + this.swim();
	}

	
}
