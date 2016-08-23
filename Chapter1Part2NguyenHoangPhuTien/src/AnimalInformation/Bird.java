package AnimalInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about bird
 * this class extend by animal
 */

public class Bird extends Animal implements Iflying,INest{

	public Bird() {
		super();
	}

	public Bird(String name, String food) {
		super(name, food);
	}

	
	@Override
	public String nesting() {
		
		return "Can nesting";
	}

	@Override
	public String fly() {
		
		return "Can flying";
	}

	@Override
	public String toString() {
		return "Bird name : " + name + ", food : " + food + " " + this.fly() + " " + this.nesting();
	}
	
	
	
}
