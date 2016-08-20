package WarGame;

public class Infantryman extends Solider{

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 20/8/2016.
	 * Version : 1.
	 * Description of infantryman.
	 * This class extends by class Solider.
	 */
	
	public Infantryman() {
		super();
		
	}

	public Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
		
	}

	/*
	 * Power of infantryman will decrease 2 when call method.
	 */
	@Override
	public void fight() {
		
		this.setPower(this.getPower() - 2);
	}

	/*
	 * Show information of infantryman.
	 * Return result as String type.
	 */
	@Override
	public String toString() {
		return "Infantryman Solider name : " + name + ", power : " + power + ", weapon : " + weapon ;
	}

	
	
}
