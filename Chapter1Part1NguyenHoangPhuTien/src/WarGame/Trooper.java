package WarGame;

public class Trooper extends Solider{

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 20/8/2016.
	 * Version : 1.
	 * Description of trooper.
	 * This class extends by class Solider.
	 */
	
	public Trooper() {
		super();
	}

	public Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	
	
	/*
	 * Show information of infantryman.
	 * Return result as String type.
	 */
	@Override
	public String toString() {
		return "Trooper Solider name : " + name + ", power : " + power + ", weapon : " + weapon ;
	}

	/*
	 * Power of trooper will decrease 3 when call method.
	 */
	@Override
	public void fight() {
		this.setPower(this.getPower() - 3);
	}
	
	
}
