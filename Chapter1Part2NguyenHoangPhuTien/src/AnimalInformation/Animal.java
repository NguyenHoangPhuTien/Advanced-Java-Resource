package AnimalInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about animal
 */

public abstract class Animal {

	String name;
	String food;
	
	public Animal() {
		super();
	}

	public Animal(String name, String food) {
		super();
		this.name = name;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
}
